package com.xworkz.engineering;

public class Ball {
  private String brand="Decathlon";
  private String sportsName="VolleyBall";
  private String manufacturer="Decathlon";
  private String customerName="Ananya";
  private String sellerName="Prem";
  private String customerAddress="shimoga";
  private String sellerAddress="shimoga";
  private long customerPhoneNumber=9019520593l;
  private long sellerPhoneNumber=9945584823l;
  private String factoryLocation="Banglore";
  private String type="lether";
  private boolean brathebale=true;
  private String shape="Speare";
  private int teamMembers=6;
  private int extraPlayers=6;
  private int gamePoint=25;
  private int gameHalfPoint=15;
  
  private char size;
  private String color;
  private double weight;
  private double bounceHeight;
  private boolean floating;
  private boolean sinking;
  private boolean reusable;
  private boolean olympicGame;
  
  public Ball(char size,String color,double weight,double bounceHeight,boolean floating,boolean sinking,boolean reusable,boolean olympicGame ) 
  {
	this.size=size;
	this.color=color;
	this.weight=weight;
	this.bounceHeight=bounceHeight;
	this.floating=floating;
	this.sinking=sinking;
	this.reusable=reusable;
	this.olympicGame=olympicGame;
  }
  
  public void show()
  {
	  System.out.println("Ball brand:"+this.brand);
	  System.out.println("Ball sportsName:"+this.sportsName);
	  System.out.println("Ball manufacturer:"+this.manufacturer);
	  System.out.println("Ball customerName:"+this.customerName);
	  System.out.println("Ball sellerName:"+this.sellerName);
	  System.out.println("Ball customerAddress:"+this.customerAddress);
	  System.out.println("Ball sellerAddress:"+this.sellerAddress);
	  System.out.println("Ball customerPhoneNumber:"+this.customerPhoneNumber);
	  System.out.println("Ball sellerPhoneNumber:"+this.sellerPhoneNumber);
	  System.out.println("Ball factoryLocation:"+this.factoryLocation);
	  System.out.println("Ball type:"+this.type);
	  System.out.println("Ball brathebale:"+this.brathebale);
	  System.out.println("Ball shape:"+this.shape);
	  System.out.println("Ball teamMembers:"+this.teamMembers);
	  System.out.println("Ball extraPlayers:"+this.extraPlayers);
	  System.out.println("Ball gamePoint:"+this.gamePoint);
	  System.out.println("Ball gameHalfPoint:"+this.gameHalfPoint);
	  System.out.println("Ball size:"+this.size);
	  System.out.println("Ball color:"+this.color);
	  System.out.println("Ball weight:"+this.weight);
	  System.out.println("Ball bounceHeight:"+this.bounceHeight);
	  System.out.println("Ball floating:"+this.floating);
	  System.out.println("Ball sinking:"+this.sinking);
	  System.out.println("Ball reusable:"+this.reusable);
	  System.out.println("Ball olympicGame:"+this.olympicGame);

  }
  
}
