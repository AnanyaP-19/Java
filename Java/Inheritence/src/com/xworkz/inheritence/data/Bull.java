package com.xworkz.inheritence.data;

public class Bull {
	
	public String breedname;
	public int quantity;
	public int cost;
	public int age;
	public String originatedIn;
	
	public Bull()
	{
		System.out.println("Created Bull");
	}
	public void bullName()
	{
		System.out.println("Created a metgod called bullName");
	}
	public void bullQantity()
	{
		System.out.println("Created a metgod called bullQantity");
	}
	public void bullcost()
	{
		System.out.println("Created a metgod called bullQantity");
	}
	public void bullAge()
	{
		System.out.println("Created a metgod called bullQantity");
	}
	public void print()
	{
		System.out.println("Bull breedname is:"+this.breedname);
		System.out.println("Bull quantity is:"+this.quantity);
		System.out.println("Bull cost is:"+this.cost);
		System.out.println("Bull age is:"+this.age);
		System.out.println("Bull originatedIn is:"+this.originatedIn);

	}
	
}
