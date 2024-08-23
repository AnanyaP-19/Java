package com.xworkz.place.data;
import com.xworkz.place.data.Sandal;
public class SandalData {
	private Sandal[] sandals=new Sandal[5];
	private int index;
	
	public void store(Sandal sandals) 
	{
	this.sandals[this.index]=sandals;
	this.index++;
	}
	public void show() {
		
		System.out.println("running sandal store");
		for(Sandal sandal:sandals) {
			if(sandal!=null) {
			sandal.display();
			}
			else {
				System.out.println("null data is found");
			}
		}
	}
}
