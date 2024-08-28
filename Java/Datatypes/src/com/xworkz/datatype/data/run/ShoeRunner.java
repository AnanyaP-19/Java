package com.xworkz.datatype.data.run;

import com.xworkz.datatype.data.Shoe;
import com.xworkz.datatype.data.Divya;
import com.xworkz.datatype.data.Omkar;
import com.xworkz.datatype.data.Harshitha;

public class ShoeRunner {

	public static void main(String[] args) {
		Divya divya=new Divya();
		divya.wear();
		
		Omkar omkar=new Omkar();
		Shoe shoe=new Shoe();
		omkar.walk(shoe);
		
		Harshitha harshitha=new Harshitha();
		harshitha.shoe=new Shoe();
		harshitha.run(); 

	}

}
