package com.xworkz.inheritence.data.run;

import com.xworkz.inheritence.data.TubeLight;

public class BulbRunner {

	public static void main(String[] args) {
		
		TubeLight tubeLight=new TubeLight();
		tubeLight.watts=280;
		System.out.println("TubeLight watts is:"+tubeLight.watts);

	}

}
