package com.xworkz.info;

import com.xworkz.info.store.City;

public class CityRunner {

	public static void main(String[] args) {
		City city1=new City();
		city1.cityStore("Shivamogga");
		city1.cityStore("Banglore");
		city1.cityStore("Mysore");
		city1.cityStore("Coorg");
		city1.cityStore("Gadag");
		city1.cityStore("Hubli");
		city1.cityStore("Durga");
		city1.cityPrint();

	}

}
