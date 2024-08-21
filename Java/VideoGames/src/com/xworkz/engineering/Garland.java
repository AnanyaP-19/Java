package com.xworkz.engineering;

public class Garland {
	
	private String type;
	private int count;
	private double cost;
	
	public Garland(String type,int count,double cost)
	{
		this.type=type;
		this.count=count;
		this.cost=cost;
		System.out.println("Created constructor using arguments");
	}
	public void show()
	{
		System.out.println("Type:"+this.type);
		System.out.println("Count:"+this.count);
		System.out.println("Cost:"+this.cost);
	}
}
