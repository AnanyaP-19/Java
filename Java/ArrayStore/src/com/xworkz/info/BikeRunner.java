package com.xworkz.info;
import com.xworkz.info.store.Bike;
public class BikeRunner {

	public static void main(String[] args) {
		Bike bike1=new Bike();
		bike1.bikeStore("RoyalEnfield");
		bike1.bikeStore("KTM");
		bike1.bikeStore("RX");
		bike1.bikeStore("Pulsur");
		bike1.bikeStore("Honda");
		bike1.bikeStore("Beast");
		bike1.bikeStore("Yamaha");
		bike1.bikePrint();
	}

}
