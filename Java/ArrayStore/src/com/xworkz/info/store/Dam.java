package com.xworkz.info.store;

public class Dam {
	private String[] dam=new String[7];
	private int index=0;
	
	public void damStore(String damNames)
	{
		this.dam[this.index]=damNames;
		this.index++;
	}
	public void damPrint()
	{
		for(String dams:dam)
		{
			System.out.println("Dam Names:"+dams);
		}
	}
}
