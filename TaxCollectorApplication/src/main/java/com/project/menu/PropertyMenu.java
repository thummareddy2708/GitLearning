package com.project.menu;

import java.util.Scanner;

import com.project.property.AddProperty;
import com.project.property.PropertyDAO;
import com.project.property.PropertyDetails;

public class PropertyMenu {

	AddProperty ap = new AddProperty();
	PropertyDetails pd = new PropertyDetails();
	PropertyDAO pao = new PropertyDAO();
	public Scanner mp = new Scanner(System.in);
	
	
	public void PropertyDetails() {
		int choose;
		
		do {
			System.out.println("1. ADD PROPERTY DETAILS");
			System.out.println("2. CALCULATE PROPERTY TAX");
			System.out.println("3. DISPLAY ALL PROPERTIES ");
			System.out.println("4. BACK TO MAIN MENU");
		
		   choose = mp.nextInt();
		   switch (choose) {
		case 1:  ap.AddPropertyDetails();
		 {
			
		}
		         break;
			
		case 2: System.out.println( pd.calculateTax());
				break;
				
		case 3: System.out.println(pao.insertProperty(pd));

		default:
			System.out.println(" INVALID CHOICE");
			
		}		
		} while(choose!=4);
	}
}
