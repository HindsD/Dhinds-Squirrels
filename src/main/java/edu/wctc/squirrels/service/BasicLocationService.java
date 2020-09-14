package edu.wctc.squirrels.service;

import edu.wctc.squirrels.entity.Location;
import edu.wctc.squirrels.repo.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicLocationService implements LocationService {
    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<Location> getLocationList() {
        List<Location> list = new ArrayList<>();
        locationRepository.findAllByOrderByCountryAscName().forEach(list::add);
        return list;
    }
}
