package com.xworkz.inheritence.data.run;

import com.xworkz.inheritence.data.Bird;

public class ChickenRunner {

	public static void main(String[] args) {
		Bird bird=new Bird();
		bird.name="Broiler";
		bird.quantity=1;
		bird.cost=200;
		bird.age=1;
		bird.calories=122;
		bird.protein=24;
		bird.fat=3;
		bird.carbs=0;
		bird.size='M';
		bird.shopName="Sri Maruthi";
		bird.print();
	}

}
