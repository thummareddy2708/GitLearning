package com.project.property;

import com.project.tax.Taxable;

public class PropertyDetails implements Taxable {
	private int propertyid;
	private int basevalue;
	private int area;
	private int age;
	private boolean maincity;
	
	
	

	
	// Default constructor 
public PropertyDetails() {
		
	}


//Parameterised constructor 
	public PropertyDetails(int propertyid,int basevalue,
			int area,int age,boolean maincity) {
		
		this.propertyid=propertyid;
		this.basevalue=basevalue;
		this.area=area;
		this.age=age;
		this.maincity= maincity;
		
	}
	
	
// Getters and Setters
	public int getPropertyid() {
		return propertyid;
	}


	public void setPropertyid(int propertyid) {
		this.propertyid = propertyid;
	}


	public int getBasevalue() {
		return basevalue;
	}


	public void setBasevalue(int basevalue) {
		this.basevalue = basevalue;
	}


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isMaincity() {
		return maincity;
	}


	public void setMaincity(boolean maincity) {
		this.maincity = maincity;
	}


	//Tostring method
	@Override
	public String toString() {
		return "PropertyDetails [propertyid=" + propertyid + ", basevalue=" + basevalue + ", area=" + area + ", age="
				+ age + ", maincity=" + maincity + "]";
	}


public double calculateTax() {
	if(maincity) {
	double propertytax = (area * age * basevalue)+(0.5 * area);
			return propertytax;
	} else {
		double propertytax = (area * age * basevalue);
		    return propertytax;
	}
}

	
	
}
