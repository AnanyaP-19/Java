package com.xworkz.place.data;
import com.xworkz.place.data.Market;
public class MarketData {
	
	private Market[] datas=new Market[5];
	private int index;
	
	public void store(Market datas) {
		
		this.datas[this.index]=datas;
		this.index++;
		
	}
	
	public void show() {
		for(Market data:datas) {
			if(data!=null) {
				data.print();
			}
			else {
				System.out.println("data is null");
			}
		}
	}
}
