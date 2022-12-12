package com.example.backend.service.impl;

import com.example.backend.model.Location;
import com.example.backend.repository.static_test_repo.InMemoryLocationRepository;
import com.example.backend.service.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationServiceImplementation implements LocationService {

    private final InMemoryLocationRepository locationRepository;

    public LocationServiceImplementation(InMemoryLocationRepository locationRepository){
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> findAll() {
        return this.locationRepository.findAll();
    }

    @Override
    public Optional<Location> findById(long id) {
        return this.locationRepository.findById(id);
    }

    @Override
    public Optional<Location> findByName(String name) {
        return locationRepository.findByName(name);
    }

    @Override
    public Optional<Location> save(String name, String image, double longitude, double latitude) {
        return locationRepository.save(name, image, longitude, latitude);
    }

    //not implemented
    @Override
    public Optional<Location> edit(String name, String image, double longitude, double latitude) {
        return Optional.empty();
    }

    @Override
    public void deleteById(long id) {
        locationRepository.deleteById(id);
    }
}
