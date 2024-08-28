package com.xworkz.datatype.data;

public class Devu {

	public WaterBottle waterBottle;
	
	public void broke() {
		
		if(waterBottle!=null)
		{
			waterBottle.fill();
			waterBottle.empty();
			waterBottle.crush();
			System.out.println("WaterBottle quantity:"+waterBottle.quantity);
			System.out.println("WaterBottel color:"+waterBottle.color);
		}
		else {
			System.out.println("WaterBottle is null");
		}
	}
}
