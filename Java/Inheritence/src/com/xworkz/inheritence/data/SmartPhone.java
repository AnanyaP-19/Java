package com.xworkz.inheritence.data;

public class SmartPhone {
	public String brand;
	public int quantity;
	public int cost;
	public String madeIn;
	
	public SmartPhone()
	{
		System.out.println("Created SmartPhone");
	}
	public void showSmartPhone()
	{
		System.out.println("Created a method called showSmartPhone");
	}
	public void print()
	{
		System.out.println("SmartPhone brand:"+this.brand);
		System.out.println("SmartPhone quantity:"+this.quantity);
		System.out.println("SmartPhone cost:"+this.cost);
		System.out.println("SmartPhone madeIn:"+this.madeIn);

	}
}
