package com.xworkz.info.store;

public class City {
	private String[] city=new String[7];
	private int index=0;
	
	public void cityStore(String cityNames)
	{
		this.city[this.index]=cityNames;
		this.index++;
	}
	public void cityPrint()
	{
		for(String cities:city)
		{
			System.out.println("City Names:"+cities);
		}
	}
}
