package com.xworkz.engineering;
import com.xworkz.engineering.GiantWheel;
public class GiantWheelRunner {

	public static void main(String[] args) {
		GiantWheel giantWheel1=new GiantWheel("Shimoga",10,50);
		GiantWheel giantWheel2=new GiantWheel("GRS",20,100);
		GiantWheel giantWheel3=new GiantWheel("GFC",15,250);

		GiantWheel giantWheel[]= {giantWheel1,giantWheel2,giantWheel3};
		System.out.println("GiantWheel length:"+giantWheel.length);
		
		for(int start=0;start<giantWheel.length;start++)
		{
			GiantWheel ref=giantWheel[start];
			ref.show();
		}
	}

}
