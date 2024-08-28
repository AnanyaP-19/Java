package com.xworkz.datatype.data.run;

import com.xworkz.datatype.data.Ananya;
import com.xworkz.datatype.data.Hoodie;
import com.xworkz.datatype.data.Madhu;
import com.xworkz.datatype.data.Manikya;

public class HoodieRunner {

	public static void main(String[] args) {
		
		Ananya ananya=new Ananya();
		ananya.purchase();
		
		Madhu madhu=new Madhu();
		Hoodie hoodie=new Hoodie();
		madhu.wash(hoodie);
		
		Manikya manikya=new Manikya();
		manikya.hoodie=new Hoodie();
		manikya.buy(); 
	}

}
