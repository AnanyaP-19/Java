package com.xworkz.engineering;

public class BallRunner {

	public static void main(String[] args) {
		Ball ball1=new Ball('S',"white",20,5,true,false,true,true);
		Ball ball2=new Ball('L',"pink",21,5.2,false,false,true,true);
		Ball ball3=new Ball('M',"grey",22,5.4,true,true,true,true);
	
		Ball[] balls=new Ball[3];
		balls[0]=ball1;
		balls[1]=ball2;
		balls[2]=ball3;
		
		for(Ball ref:balls)
		{
			ref.show();
		}

	}

}
