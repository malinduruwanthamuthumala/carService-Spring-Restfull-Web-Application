package com.spring.restfull.carservice.carservice;

import java.util.ArrayList;
import java.util.List;

public class CarDao {

	static int counter = 2;
	static List<Car> carList = new ArrayList<>();
	
	static {
		carList.add(new Car(0,"ABC-1223","HONDA"));
		carList.add(new Car(1,"ffC-235325","toyota"));
		counter = carList.size();
	}
	
	public static List<Car> getAllCars() {
		return carList;
	}
	
	public static Car createCar(Car car) {		
		if(car.getId() == null) {
			car.setId(++counter);			
		}	
		carList.add(car);
		return car;
	}
	
	public static Car getCar(int id) {
		
		for (Car c :carList) {
			if (c.getId() == id) {
				return c;
			}			
		}
		return null;		
	}

	
}
