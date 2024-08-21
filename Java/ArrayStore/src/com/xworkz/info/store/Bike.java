package com.xworkz.info.store;

public class Bike {
	private String[] bike=new String[7];
	private int index=0;
	
	public void bikeStore(String bikeNames)
	{
		this.bike[this.index]=bikeNames;
		this.index++;
	}
	public void bikePrint()
	{
		for(String bikes:bike)
		{
			System.out.println("Bike Names:"+bikes);
		}
	}
}
