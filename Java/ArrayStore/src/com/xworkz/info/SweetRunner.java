package com.xworkz.info;
import com.xworkz.info.store.Sweet;
public class SweetRunner {

	public static void main(String[] args) {
		Sweet sweet1=new Sweet();
		sweet1.sweetStore("Kunda");
		sweet1.sweetStore("Jalebi");
		sweet1.sweetStore("Rasmalai");
		sweet1.sweetStore("Rasgulla");
		sweet1.sweetStore("DharwadPeda");
		sweet1.sweetStore("Milkcake");
		sweet1.sweetStore("KajuKatli");
		sweet1.sweetPrint();

	}

}
