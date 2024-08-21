package com.xworkz.engineering;

public class SubmarineRunner {

	public static void main(String[] args) {
		Submarine submarine1=new Submarine(200,250,100,1000,10);
		Submarine submarine2=new Submarine(250,300,110,800,8);
		Submarine submarine3=new Submarine(300,200,120,1500,9);
		 
		Submarine[] submarines=new Submarine[3];
		submarines[0]=submarine1;
		submarines[1]=submarine2;
		submarines[2]=submarine3;
		

		for(Submarine ref:submarines)
		{
			ref.show();
		}


	}

}
