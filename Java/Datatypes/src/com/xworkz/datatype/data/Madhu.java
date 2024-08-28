package com.xworkz.datatype.data;

public class Madhu {

	public void wash(Hoodie hoodie)
	{
		if(hoodie!=null)
		{
			hoodie.protect();
			hoodie.wore();
			System.out.println("Hoodie brand:"+hoodie.brand);
			System.out.println("Hoodie cost:"+hoodie.cost);
		}
		else
		{
			System.out.println("Hoodie is null");
		}
	}
}
