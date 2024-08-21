package com.xworkz.info.store;

public class River {
	private String[] river=new String[7];
	private int index=0;
	
	public void riverStore(String riverNames)
	{
		this.river[this.index]=riverNames;
		this.index++;
	}
	public void riverPrint()
	{
		for(String rivers:river)
		{
			System.out.println("River Names:"+rivers);
		}
	}
}
