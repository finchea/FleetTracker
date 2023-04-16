package com.fleettracker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fleettracker.dto.AircraftDTO;
import com.fleettracker.service.AircraftServiceStub;

@Controller
public class FleetTrackerController {
	
	@Autowired
	private AircraftServiceStub aircraftServiceStub;
	
<<<<<<< HEAD
	
=======
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Model model) {
		List<AircraftDTO> outOfServiceAircraft = aircraftServiceStub.getOutofServiceAircraft();
		model.addAttribute("outOfServiceAircraft", outOfServiceAircraft);
		return "start";
	}
>>>>>>> 2fe8a6360560a2a234d7a03f829ac7f4c2118c69
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read(Model model) {
		List<AircraftDTO> outOfServiceAircraft = aircraftServiceStub.getOutofServiceAircraft();
		model.addAttribute("outOfServiceAircraft", outOfServiceAircraft);
		return "start";
	}
	
	@RequestMapping(value="/AircraftStatus", method=RequestMethod.GET)
	public String AircraftStatus(Model model) {
		AircraftDTO aircraftDTO = new AircraftDTO();
		model.addAttribute("aircraftDTO", aircraftDTO);
		List<AircraftDTO> outOfServiceAircraft = aircraftServiceStub.getOutofServiceAircraft();
		model.addAttribute("outOfServiceAircraft", outOfServiceAircraft);
		return "AircraftStatus";
	}
	
	@PostMapping(value="/SubmitEvent")
	public String submitEvent(@ModelAttribute("aircraftDTO")AircraftDTO aircraftDTO, Model model) {
		aircraftServiceStub.save(aircraftDTO);
		AircraftDTO blankAircraft = new AircraftDTO();
		model.addAttribute("aircraftDTO", blankAircraft);
		List<AircraftDTO> outOfServiceAircraft = aircraftServiceStub.getOutofServiceAircraft();
		model.addAttribute("outOfServiceAircraft", outOfServiceAircraft);
		return "AircraftStatus";		
	}
	
	

}
