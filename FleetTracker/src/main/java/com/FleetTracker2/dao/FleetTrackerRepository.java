package com.FleetTracker2.dao;

import org.springframework.data.repository.CrudRepository;

import com.fleettracker.dto.AircraftDTO;

public interface FleetTrackerRepository extends CrudRepository<AircraftDTO, Integer> {

}
