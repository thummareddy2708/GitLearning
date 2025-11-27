package com.project.menu;

import java.util.Scanner;

public class Menu {
	PropertyMenu pm = new PropertyMenu();
	VehicleMenu vm = new VehicleMenu();
	public Scanner m = new Scanner(System.in);
	
	public void ShowMenu() {
		int select;
		
		do {
			System.out.println("1. PROPERTY TAX");
			System.out.println("2. VEHICLE TAX");
			System.out.println("3. TOTAL");
			System.out.println("4. EXIT");
			
			select=m.nextInt();
			switch (select) {
			case 1: 
				  pm.PropertyDetails();
				break;
				
			case 2:
				vm.showVehicleMenu();
				break;
				  

			default:System.out.println(" INVALID CHOICE");
				
			}
		} while (select!=4);
	}

}
