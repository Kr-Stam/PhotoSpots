package com.example.backend.web;

import com.example.backend.model.Location;
import com.example.backend.service.LocationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/locations")
public class LocationController {


    private final LocationService locationService;

    public LocationController(LocationService locationService){
        this.locationService = locationService;
    }

    @GetMapping
    public String getLocationsPage(Model model){
        List<Location> locations = this.locationService.findAll();
        model.addAttribute("locations", locations);
        return "locations";
    }

    @GetMapping("/add-location")
    public String addLocationPage(Model model){
        return "addNewLocation";
    }

    @PostMapping("/add")
    public String saveLocation(
            @RequestParam String name,
            @RequestParam String photo,
            @RequestParam double longitude,
            @RequestParam double latitude
    ) {
        this.locationService.save(name, photo, longitude, latitude);
        return "redirect:/locations";
    }

}
