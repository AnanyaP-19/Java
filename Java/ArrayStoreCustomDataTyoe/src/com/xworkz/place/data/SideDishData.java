package com.xworkz.place.data;
import com.xworkz.place.data.SideDish;
public class SideDishData {
	
	private SideDish[] sideDishs = new SideDish[5];
	private int index;

	public void store(SideDish sideDishs) {

		this.sideDishs[this.index] = sideDishs;
		this.index++;
	}

	public void show() 
	{

		for (SideDish data : sideDishs) {
			if (data != null) {

				data.display();
			} else {
				System.out.println("data is null");
			}

		}
	}
}
