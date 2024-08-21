package com.xworkz.info.store;

public class Sweet {
	private String[] sweet=new String[7];
	private int index=0;
	
	public void sweetStore(String sweetNames)
	{
		this.sweet[this.index]=sweetNames;
		this.index++;
	}
	public void sweetPrint()
	{
		for(String sweets:sweet)
		{
			System.out.println("Sweet Names:"+sweets);
		}
	}
}
