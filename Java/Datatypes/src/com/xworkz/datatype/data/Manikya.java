package com.xworkz.datatype.data;

public class Manikya {
	
	public Hoodie hoodie;
	
	public void buy()
	{
		if(hoodie!=null)
		{
			hoodie.protect();
			hoodie.printed();
			System.out.println("Hoodie brand:"+hoodie.brand);
			System.out.println("Hoodie cost:"+hoodie.cost);
		}
		else
		{
			System.out.println("Hoodie is null");
		}
	}
}
