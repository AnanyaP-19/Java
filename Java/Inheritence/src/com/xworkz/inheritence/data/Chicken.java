package com.xworkz.inheritence.data;

public class Chicken {
	
	public String name;
	public int quantity;
	public int cost;
	public int age;
	public int calories;
	public int protein;
	public int fat;
	public int carbs;
	public char size;
	public String shopName;
	
	public Chicken()
	{
		System.out.println("Created Chicken");
	}
	public void chickenName()
	{
		System.out.println("Created a metgod called chickenName");
	}
	public void chickenQantity()
	{
		System.out.println("Created a metgod called chickenQantity");
	}
	public void chickencost()
	{
		System.out.println("Created a metgod called chickenQantity");
	}
	public void chickenAge()
	{
		System.out.println("Created a metgod called chickenQantity");
	}
	public void print()
	{
		System.out.println("chicken name is:"+this.name);
		System.out.println("chicken quantity is:"+this.quantity);
		System.out.println("chicken cost is:"+this.cost);
		System.out.println("chicken age is:"+this.age);
		System.out.println("chicken calories is:"+this.calories);
		System.out.println("chicken protein is:"+this.protein);
		System.out.println("chicken fat is:"+this.fat);
		System.out.println("chicken carbs is:"+this.carbs);
		System.out.println("chicken size is:"+this.size);
		System.out.println("chicken shopName is:"+this.shopName);
	}
}
