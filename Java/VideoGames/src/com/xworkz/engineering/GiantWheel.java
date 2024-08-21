package com.xworkz.engineering;

public class GiantWheel {
	private String location;
	private int noOfWheels;
	private double cost;
	
	public GiantWheel(String location,int noOfWheels,double cost)
	{
		this.location=location;
		this.noOfWheels=noOfWheels;
		this.cost=cost;
		System.out.println("Created argument const");
		
	}
	
	public void show()
	{
		System.out.println("Location:"+this.location);
		System.out.println("noOfWheels:"+this.noOfWheels);
		System.out.println("Cost:"+this.cost);
	}
}
