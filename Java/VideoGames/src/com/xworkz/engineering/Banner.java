package com.xworkz.engineering;

public class Banner {
	private double height;
	private String color;
	private double cost;
	
	public Banner(double height,String color,double cost)
	{
		this.height=height;
		this.color=color;
		this.cost=cost;
		System.out.println("Created argument const");
		
	}
	
	public void show()
	{
		System.out.println("Height:"+this.height);
		System.out.println("Color:"+this.color);
		System.out.println("Cost:"+this.cost);
	}
}
