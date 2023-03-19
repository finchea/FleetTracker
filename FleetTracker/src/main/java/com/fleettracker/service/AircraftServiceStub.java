package com.fleettracker.service;

import org.springframework.stereotype.Component;

import com.fleettracker.dto.AircraftDTO;

@Component
public class AircraftServiceStub {
	
	public AircraftDTO fetchById(int id) {
		AircraftDTO aircraftDTO = new AircraftDTO();
		aircraftDTO.setAircraftId(12);
		aircraftDTO.setTailNumber("N767AX");
		aircraftDTO.setReason("DAMAGED");
		aircraftDTO.setRemark("Bird strike to the #1 engine");
		return aircraftDTO;
	}
	
	public void save(AircraftDTO aircraftDTO) {
		
	}
}
