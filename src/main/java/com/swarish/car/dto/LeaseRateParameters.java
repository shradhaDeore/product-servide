package com.swarish.car.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LeaseRateParameters {
	
	  private int months;
	  private long mileage;
	  private long nettprice;
	  private float interestRate;
	  private long carId;
	  
	  public LeaseRateParameters() {
		  super();
	  }
	  
	  
	  public LeaseRateParameters(int months, long mileage, long nettprice, float interestRate, long carId) {
		super();
		this.months = months;
		this.mileage = mileage;
		this.nettprice = nettprice;
		this.interestRate = interestRate;
		this.carId = carId;
	 }

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public long getMileage() {
		return mileage;
	}

	public void setMileage(long mileage) {
		this.mileage = mileage;
	}

	public long getNettprice() {
		return nettprice;
	}

	public void setNettprice(long nettprice) {
		this.nettprice = nettprice;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public long getCarId() {
		return carId;
	}

	public void setCarId(long carId) {
		this.carId = carId;
	}

}
