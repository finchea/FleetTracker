package com.FleetTracker2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.fleettracker.dto.AircraftDTO;

@Component
public class AirCraftDAO {

	@Autowired
	FleetTrackerRepository  fleetTrackerRepository;
	
	
	public boolean save(AircraftDTO aircraftDTO) throws Exception{
		fleetTrackerRepository.save(aircraftDTO);
		return false;
	}
	
}
