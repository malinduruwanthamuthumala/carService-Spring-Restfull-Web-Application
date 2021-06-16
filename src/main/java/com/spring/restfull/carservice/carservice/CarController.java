package com.spring.restfull.carservice.carservice;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class CarController {

	
	@GetMapping("/car")
	public List<Car> getAllCars(){
		return CarDao.getAllCars();
	}
	
	@GetMapping("/car/{id}")
	public Object getCar(@PathVariable int id) {
		
		Car car = CarDao.getCar(id);
		if (car == null) {
			throw new UserNotFoundException("id : " + id);
		}
		
		return car;
	}
	
	@PostMapping("/car")
	public  ResponseEntity<Object> createCar(@RequestBody Car car) {
		Car savedCar = CarDao.createCar(car);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}").buildAndExpand(savedCar.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
}
