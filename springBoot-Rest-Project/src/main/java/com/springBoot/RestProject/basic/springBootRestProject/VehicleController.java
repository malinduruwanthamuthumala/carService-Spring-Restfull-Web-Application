package com.springBoot.RestProject.basic.springBootRestProject;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
	
	@GetMapping("/vehicle")
	public List<Vehicle> getALLVehicles(){
		return Arrays.asList(new Vehicle(1l,"car","CAR 6789"),	new Vehicle(2l,"van","BAS 7889"));
	}

}
