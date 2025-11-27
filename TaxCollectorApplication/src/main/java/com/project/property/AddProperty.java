package com.project.property;

import java.util.Scanner;

public class AddProperty {
	PropertyDetails pd = new PropertyDetails();
	public Scanner ap = new Scanner(System.in); 
	
	public void AddPropertyDetails() {
		
		System.out.println(" ENTER THE PROPERTY DETAILS ");
	    System.out.println(" ENTER THE BASE VALUE OF LAND");
	    pd.setBasevalue(ap.nextInt());
	    
	    System.out.println("ENTER THE BUILDUP AREA OF LAND");
	    pd.setArea(ap.nextInt());
	    
	    System.out.println("ENTER THE AGE OF LAND IN YEARS");
	  pd.setAge(ap.nextInt());
	  
	    System.out.println("IS LAND LOCATED IN CITY?(YES : Y, NO: N");
	    pd.setMaincity(ap.hasNext());
	}
	

}
