package com.fleettracker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.FleetTracker2.dao.AirCraftDAO;
import com.fleettracker.dto.AircraftDTO;

@Component
@Service
public class AircraftServiceStub   {
	
	private List<AircraftDTO> outOfServiceAircraft;
	
    @Autowired
	AirCraftDAO aircraftDAO;
	
	public AircraftServiceStub() {
		outOfServiceAircraft = new ArrayList<AircraftDTO>();
		
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
		
		AircraftDTO aircraftDTO3 = new AircraftDTO();
		aircraftDTO3.setAircraftId(10);
		aircraftDTO3.setTailNumber("N762CK");
		aircraftDTO3.setReason("AOG");
		aircraftDTO3.setRemark("Awaiting replacement FMC and required engineering order from Boeing");
		aircraftDTO3.setNextUpdate("21:00z");
		
		outOfServiceAircraft.add(aircraftDTO);
		outOfServiceAircraft.add(aircraftDTO2);
		outOfServiceAircraft.add(aircraftDTO3);
	}
	
	public AircraftDTO fetchById(int id) {
		
		return outOfServiceAircraft.get(0);
	}
	
	public void save(AircraftDTO aircraftDTO) {
		outOfServiceAircraft.add(aircraftDTO);
	}
	
	public List<AircraftDTO> getOutofServiceAircraft() {
		return outOfServiceAircraft;
		
	}
}
