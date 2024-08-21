package com.xworkz.engineering;

public class Snake {
	private String name;
	private int length;
	private String type;
	
	public Snake(String name,int length,String type)
	{
		this.name=name;
		this.length=length;
		this.type=type;
		System.out.println("Created Snake constructor");
	}
	
	public void show()
	{
		System.out.println("Snake name:"+this.name);
		System.out.println("Snake length:"+this.length);
		System.out.println("Snake type:"+this.type);

	}
}
