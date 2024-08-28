package com.xworkz.datatype.data;

public class Omkar {
	
	public void walk(Shoe shoe)
	{
		if(shoe!=null)
		{
			shoe.safeguard();
			shoe.enhanceWalk();
			System.out.println("Shoe brand:"+shoe.brand);
			System.out.println("Shoe cost:"+shoe.cost);
		}
		else
		{
			System.out.println("Shoe is null");
		}
	}
}
