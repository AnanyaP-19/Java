package com.xworkz.datatype.data;

public class Gunashree {
	
	public void drink()
	{
		WaterBottle waterBottle = new WaterBottle();
		waterBottle.fill();
		waterBottle.empty();
		waterBottle.crush();
		System.out.println("WaterBottle quantity:"+waterBottle.quantity);
		System.out.println("WaterBottel color:"+waterBottle.color);
	}
}
