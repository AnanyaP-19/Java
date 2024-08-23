package com.xworkz.place.data.run;
import com.xworkz.place.data.Sandal;
import com.xworkz.place.data.SandalData;

public class SandalRunner {

	public static void main(String[] args) {

		SandalData sandalData=new SandalData();
		sandalData.show();
		Sandal sandal1=new Sandal("bata", 6, "black", 1000);
		sandal1.display();
		Sandal sandal2=new Sandal("Nike", 7, "red", 560);
		sandal2.display();
		Sandal sandal3=new Sandal("Roadster", 8, "white", 300);
		sandal3.display();
		Sandal sandal4=new Sandal("puma", 10, "grey", 2000);
		sandal4.display();
		Sandal sandal5=new Sandal("reebok", 9, "green", 700);
		sandal5.display();
		
	}

}