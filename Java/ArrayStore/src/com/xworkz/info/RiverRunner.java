package com.xworkz.info;
import com.xworkz.info.store.River;
public class RiverRunner {

	public static void main(String[] args) {
		River river1=new River();
		river1.riverStore("Bhadra");
		river1.riverStore("Tunga");
		river1.riverStore("Ganga");
		river1.riverStore("Godavari");
		river1.riverStore("Kaveri");
		river1.riverStore("Sharavati");
		river1.riverStore("Krishna");
		river1.riverPrint();

	}

}
