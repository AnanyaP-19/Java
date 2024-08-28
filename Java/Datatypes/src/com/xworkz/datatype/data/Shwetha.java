package com.xworkz.datatype.data;

public class Shwetha {

	public void wash(WaterBottle waterBottle) {
		
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
