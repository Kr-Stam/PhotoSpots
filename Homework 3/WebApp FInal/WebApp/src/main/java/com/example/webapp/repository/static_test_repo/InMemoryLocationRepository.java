package com.example.webapp.repository.static_test_repo;

import com.example.webapp.bootstrap.*;
import com.example.webapp.model.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryLocationRepository {

    public List<Location> findAll(){
        return DataHolder.locations;
    }

    public Optional<Location> findById(Long id) {
        return DataHolder.locations.stream().filter(i -> i.getId() == id).findFirst();
    }

    public Optional<Location> findByName(String name) {
        return DataHolder.locations.stream().filter(i -> i.getName().equals(name)).findFirst();
    }

    public void deleteById(Long id) {
        DataHolder.locations.removeIf(i -> i.getId() == id);
    }

    public Optional<Location> save(String name, String image, double longitude, double latitude) {
        DataHolder.locations.removeIf(i -> i.getName().equals(name));
        Location location = new Location(name,  image,  longitude,  latitude);
        DataHolder.locations.add(location);
        return Optional.of(location);
    }
}
