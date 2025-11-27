package com.project.vehicle;

import com.project.tax.Taxable;


public class VehicleTax implements Taxable{
	String regno;
	String brand;
	int maxvelocity;
	int capacity;
	int purchasecost;
	String vehicletype;

	
	public VehicleTax(){
		
	}
	public VehicleTax(String regno,String brand,int maxvelocity,int capacity,
			int purchasecost,String type) {
		this.regno=regno;
		this.brand=brand;
		this.maxvelocity=maxvelocity;
		this.purchasecost=purchasecost;
		this.vehicletype=type;                                                                                                                                                                  
	}

	public String getRegno() {
		return regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getMaxvelocity() {
		return maxvelocity;
	}

	public void setMaxvelocity(int maxvelocity) {
		this.maxvelocity = maxvelocity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getPurchasecost() {
		return purchasecost;
	}

	public void setPurchasecost(int purchasecost) {
		this.purchasecost = purchasecost;
	}

	public String getType() {
		return vehicletype;
	}

	public void setType(String type) {
		this.vehicletype = type;
	}
	
	

	
	@Override
	public String toString() {
		return "VehicleTax [regno=" + regno + ", brand=" + brand + ", maxvelocity=" + maxvelocity + ", capacity="
				+ capacity + ", purchasecost=" + purchasecost + ", type=" + vehicletype + "]";
	}

	public double calculateTax() {
		if(vehicletype.equalsIgnoreCase("petrol")) {
			double totalvehicletax = maxvelocity + capacity + 0.10 * purchasecost;
			return totalvehicletax;
		}
		else if(vehicletype.equalsIgnoreCase("Diesel")) {
			double totalvehicletax = maxvelocity + capacity + 0.11 * purchasecost;
			return totalvehicletax;
		}
		else if(vehicletype.equalsIgnoreCase("CNG")) {
			double totalvehicletax = maxvelocity + capacity + 0.12 * purchasecost;
			return totalvehicletax;
		}
		else if(vehicletype.equalsIgnoreCase("LPG")) {
			double totalvehicletax = maxvelocity + capacity + 0.12 * purchasecost;
			return totalvehicletax;
		}
		else {
			System.out.println(" Please enter the type of vehicle as PETROL/DEISEL/CNG/LPG");
				return -1;
					
		}
		
	}

}
