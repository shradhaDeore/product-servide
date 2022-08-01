package com.swarish.car.controller;

import java.text.DecimalFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swarish.car.dto.LeaseRateParameters;
import com.swarish.car.entity.Car;
import com.swarish.car.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
	
	@Autowired
	private CarService carservice;
	
	@GetMapping(value="/getAllCars")
	public List<Car> getAllCars(){
       return carservice.getAllCar();
	}
	
	@GetMapping(value="/getCarById/{id}")
	public Car getAllCars(@PathVariable long id ){  
       return carservice.getCarById(id);
	}
	
	@PostMapping(value="/save")
    public String saveCar(@RequestBody Car car){
      carservice.saveCar(car);
      return "New Car Added";

	}
	
	@DeleteMapping(value="/deletecar/{id}")
	public List<Car> deleteCar(@PathVariable long id){
		carservice.deleteCar(id);
		return carservice.getAllCar();		
	}

   
	@PostMapping(value= "/postleaserate")
	public Car getLeaseRatePost(@RequestBody LeaseRateParameters leaseRequestParam){
		return carservice.getCarLeaseRate(leaseRequestParam);
	}
		
}
	
	
	
	