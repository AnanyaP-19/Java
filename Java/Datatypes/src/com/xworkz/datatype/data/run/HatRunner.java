package com.xworkz.datatype.data.run;

import com.xworkz.datatype.data.Upendra;
import com.xworkz.datatype.data.Yash;
import com.xworkz.datatype.data.Hat;
import com.xworkz.datatype.data.Puneet;

public class HatRunner {

	public static void main(String[] args) {
		Upendra upendra=new Upendra();
		upendra.wear();
		
		Yash yash=new Yash();
		Hat hat=new Hat();
		yash.war(hat);
		
		Puneet puneet=new Puneet();
		puneet.hat=new Hat();
		//Hat hat2=new Hat();
		//puneet.hat=hat2;
;		puneet.age=49;
		System.out.println(puneet.age);
		puneet.fold(); 
	}

}
