package com.xworkz.inheritence.data.run;

import com.xworkz.inheritence.data.Animal;

public class BullRunner {

	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.breedname="Red Sindhi";
		animal.quantity=1;
		animal.cost=25000;
		animal.age=8;
		animal.originatedIn="India";
		animal.print();

	}

}
