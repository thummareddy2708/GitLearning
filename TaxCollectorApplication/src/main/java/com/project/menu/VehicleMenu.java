package com.project.menu;

import java.util.Scanner;

import com.project.vehicle.AddVehicle;
import com.project.vehicle.VehicleTax;

public class VehicleMenu {
	
	AddVehicle av = new AddVehicle();
	VehicleTax vt = new VehicleTax();
	public Scanner sc = new Scanner(System.in);
	
	public void showVehicleMenu() {
	int choice;
	do {
		System.out.println("-------VEHICLE MENU-----");
		System.out.println("1. ADD VEHICLE DETAILS");
		System.out.println("2. CALCULATE VEHICLE TAX");
		System.out.println("3. DISPLAY ALL VEHICLES");
		System.out.println("4. GO BACK TO MENU");
		
		choice = sc.nextInt();
		switch(choice) {
		case 1:  av.AddvehicleDetails();
					break;
					
		case 2:System.out.println(vt.calculateTax());
					break;
					
		case 3: 
			    break;
			    
		case 4: 
					
		default: 
			 System.out.println("INVALID CHOICE");
		
		}
		 
	
	
	}
	while(choice!=4);
	
}}