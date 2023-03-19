package com.fleettracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fleettracker.dto.AircraftDTO;
import com.fleettracker.service.AircraftServiceStub;

@Controller
public class FleetTrackerController {
	
	@Autowired
	private AircraftServiceStub aircraftServiceStub;
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read(Model model) {
		AircraftDTO aircraftDTO = aircraftServiceStub.fetchById(12);
		model.addAttribute("aircraftDTO", aircraftDTO);
		return "start";
	}
	
	

}
