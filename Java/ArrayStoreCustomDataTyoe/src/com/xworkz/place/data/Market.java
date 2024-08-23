package com.xworkz.place.data;

public class Market {
	
	private String name;
	private String location;
	
	public Market(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	public void print() {
		System.out.println("name: "+name);
		System.out.println("location: "+location);
	}
}
