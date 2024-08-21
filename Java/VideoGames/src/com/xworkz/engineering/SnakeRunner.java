package com.xworkz.engineering;

public class SnakeRunner {

	public static void main(String[] args) {
		Snake snake1=new Snake("Cobra",12,"Live");
		Snake snake2=new Snake("Anaconda",22,"Live");
		Snake snake3=new Snake("Python",21,"Live");
		
		Snake[]snakes=new Snake[3];
		snakes[0]=snake1;
		snakes[1]=snake2;
		snakes[2]=snake3;
		
		for(Snake value:snakes)
		{
			value.show();
		}

	}

}
