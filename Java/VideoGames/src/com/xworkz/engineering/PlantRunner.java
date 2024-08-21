package com.xworkz.engineering;

public class PlantRunner {

	public static void main(String[] args) {
		Plant plant1=new Plant(51,5,21,200,1);
		Plant plant2=new Plant(52,10,22,400,2);
		Plant plant3=new Plant(53,15,23,600,3);
		
		Plant[]plants=new Plant[3];
		plants[0]=plant1;
		plants[1]=plant2;
		plants[2]=plant3;
		
		
		for(Plant ref:plants)
		{
			ref.show();
		}

	}

}
