package com.xworkz.inheritence.data;

public class Halwa {
	
	public String name;
	public int quantity;
	public int cost;
	
	public Halwa()
	{
		System.out.println("Created Halwa");
	}
	
	public void showHalwa()
	{
		System.out.println("Created a method called showHalwa");
	}
	public void print()
	{
		System.out.println("Halwa name:"+this.name);
		System.out.println("Halwa quantity:"+this.quantity);
		System.out.println("Halwa cost:"+this.cost);

	}
}
