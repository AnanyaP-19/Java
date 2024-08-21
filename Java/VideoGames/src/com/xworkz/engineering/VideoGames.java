package com.xworkz.engineering;

public class VideoGames {
	
	private String name;
	private int noOfPlayers;
	private double cost;
	
	
	public VideoGames(String name,int noOfPlayers,double cost)
	{
		this.name=name;
		this.noOfPlayers=noOfPlayers;
		this.cost=cost;
		System.out.println("created constructors using parameters");
	}
	
	public void show()
	{
		System.out.println("Name:"+this.name);
		System.out.println("noOfPlayers:"+this.noOfPlayers);
		System.out.println("Cost:"+this.cost);
	}
	}


