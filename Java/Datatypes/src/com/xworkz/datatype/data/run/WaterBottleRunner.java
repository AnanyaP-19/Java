package com.xworkz.datatype.data.run;

import com.xworkz.datatype.data.WaterBottle;
import com.xworkz.datatype.data.Gunashree;
import com.xworkz.datatype.data.Shwetha;
import com.xworkz.datatype.data.Devu;

public class WaterBottleRunner {

	public static void main(String[] args) {
		
		Gunashree gunashree=new Gunashree();
		gunashree.drink();
		
		Shwetha shwetha=new Shwetha();
		WaterBottle waterBottle=new WaterBottle();
		shwetha.wash(waterBottle);
		
		Devu devu=new Devu();
		devu.waterBottle=new WaterBottle();
		devu.broke(); 

	}

}
