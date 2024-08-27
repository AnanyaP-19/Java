package com.xworkz.inheritence.data.run;

import com.xworkz.inheritence.data.Phone;

public class SmartPhoneRunner {

	public static void main(String[] args) {
		Phone phone=new Phone();
		phone.brand="MI";
	    phone.quantity=1;
		phone.cost=10000;
		phone.madeIn="China";
		phone.print();

	}

}
