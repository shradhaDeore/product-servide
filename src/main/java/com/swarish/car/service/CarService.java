package com.swarish.car.service;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Service;

import com.swarish.car.dto.LeaseRateParameters;
import com.swarish.car.entity.Car;


@Service
public class CarService {
	
	
	public static List<Car> carInfoList = new ArrayList<Car>();
	public CarService() {

		carInfoList.add(new Car(1,"Suzuki-2021","Isuzu","V1.0","20",8000.00f,63000.00,""));
		carInfoList.add(new Car(2,"Suzuki-2022","Isuzu","V2.0","20",9000.00f,73000.00,""));
		carInfoList.add(new Car(3,"Suzuki-2023","Isuzu","V3.0","20",7000.00f,83000.00,""));
		carInfoList.add(new Car(4,"Suzuki-2024","Isuzu","V4.0","20",6000.00f,93000.00,""));
  }
	
	public List<Car> getAllCar() {
		return carInfoList;
	}
	
	public Car getCarId(long id) {
		Car carInfo = null;
		for(Car car: carInfoList) {
			if(car.getId()==id) {
				carInfo = car;
				break;
			}
		}
		return carInfo;
	}
	
	public boolean saveCar(Car car) {
		boolean result = carInfoList.add(car);
		return result;
	}
	
	public boolean deleteCar(long id) {
		ListIterator<Car> itr=carInfoList.listIterator();
		while(itr.hasNext()) {
		Car car=itr.next();
		if(car.getId()==id) {
		itr.remove();
		return true;
		}
		}
		return false;

	}
		
	private String getCarLeaseRate(long mileage,int duration,float interestRate,double nettPrice) {
		String pattern = "###,###.##";
		double leaseRate = (((mileage/12)*duration)/nettPrice) + (((interestRate/100)*nettPrice)/12);
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		String format = decimalFormat.format(leaseRate);
		System.out.println("REM::: leaseRate::"+leaseRate);
		return format;
	}

	public Car getCarLeaseRate(LeaseRateParameters leaseRequestParam) {
		Car car = null;
		car = getCarById(leaseRequestParam.getCarId());
		System.out.println("####CAR BEFORE LEASE RATE CAL ######");
		System.out.println("leaseRate::"+car.getNetPrice());
		if(car!=null) {
			System.out.println("Incomming parms::"+leaseRequestParam.getMileage()+" "+leaseRequestParam.getMonths()+ " "+leaseRequestParam.getInterestRate() );
			String leaseRate = getCarLeaseRate(leaseRequestParam.getMileage(),leaseRequestParam.getMonths(),leaseRequestParam.getInterestRate(),car.getNetPrice());
			car.setLeaseRate(leaseRate);
		}
		System.out.println("####CAR AFTER LEASE RATE CAL ######");
		System.out.println(car.toString());
		return car;
	}
	
	public Car getCarById(long id) {
		Car carInfo = null;
		for (Car car : carInfoList) {
			if(car.getId()==id) {
				carInfo = car;
				break;
			}
		}
		return carInfo;
	}
}
	
	








