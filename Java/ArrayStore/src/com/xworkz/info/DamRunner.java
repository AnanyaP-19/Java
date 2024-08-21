package com.xworkz.info;

import com.xworkz.info.store.Dam;

public class DamRunner {

	public static void main(String[] args) {
		Dam dam1=new Dam();
		dam1.damStore("Bhadra");
		dam1.damStore("Gajnur");
		dam1.damStore("Linganmakki");
		dam1.damStore("KRS");
		dam1.damStore("Kabini");
		dam1.damStore("TungaBhadra");
		dam1.damStore("Almatti");
		dam1.damPrint();
	}

}
