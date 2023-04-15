package com.fleettracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages={"com.FleetTracker2.dao","com.FleetTrackerController.java", "com.fleettracker.dto", "com.fleettracker.service"})
@EnableCaching

public class FleetTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetTrackerApplication.class, args);
	}

}
