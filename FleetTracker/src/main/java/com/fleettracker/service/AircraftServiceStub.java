package com.fleettracker.service;

import java.util.ArrayList;
import java.util.List;

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
		aircraftDTO.setNextUpdate("13:21z");
		return aircraftDTO;
	}
	
	public void save(AircraftDTO aircraftDTO) {
		
	}
	
	public List<AircraftDTO> GetOutofServiceAircraft() {
		List<AircraftDTO> outOfServiceAircraft = new ArrayList<AircraftDTO>();
		
		AircraftDTO aircraftDTO = new AircraftDTO();
		aircraftDTO.setAircraftId(12);
		aircraftDTO.setTailNumber("N767AX");
		aircraftDTO.setReason("DAMAGED");
		aircraftDTO.setRemark("Bird strike to the #1 engine");
		aircraftDTO.setNextUpdate("13:21z");
		
		AircraftDTO aircraftDTO2 = new AircraftDTO();
		aircraftDTO2.setAircraftId(10);
		aircraftDTO2.setTailNumber("N650GT");
		aircraftDTO2.setReason("MAINTENANCE");
		aircraftDTO2.setRemark("#1 Generator inop");
		aircraftDTO2.setNextUpdate("15:00z");
		aircraftDTO2.setBackInService(true);
		
		outOfServiceAircraft.add(aircraftDTO);
		outOfServiceAircraft.add(aircraftDTO2);
		
		return outOfServiceAircraft;
		
	}
}
