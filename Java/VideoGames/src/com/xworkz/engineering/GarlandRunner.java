package com.xworkz.engineering;
import com.xworkz.engineering.Garland;
public class GarlandRunner {

	public static void main(String[] args) {
	
		Garland garland1=new Garland("Rose",2,1000);
		Garland garland2=new Garland("Lilly",2,2000);
		Garland garland3=new Garland("jasmin",2,800);
		
		Garland garland[]= {garland1,garland2,garland3};
		System.out.println("Garland length:"+garland.length);
		
		for(int start=0;start<garland.length;start++)
		{
			Garland ref=garland[start];
			ref.show();
		}
	}

}
