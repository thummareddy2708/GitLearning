package com.project.vehicle;

import java.util.Scanner;

public class AddVehicle {
	VehicleTax vt = new VehicleTax();

	Scanner ch = new Scanner(System.in);
	
	public  void AddvehicleDetails() {
		
		System.out.println("ENTER VEHICLE REGISTRATION NUMBER");
		vt.setRegno(ch.next());
		
		System.out.println("ENTER BRAND OF THE VEHICLE");
		vt.setBrand(ch.next());
		
		System.out.println("ENTER MAXIMUM VELOCITY OF THE VEHICLE ");
		vt.setMaxvelocity(ch.nextInt());
		
		System.out.println("ENTER CAPACITY (NO OF SEATS ) IN THE VEHICLE");
		vt.setCapacity(ch.nextInt());
		
		
		
	}
}
