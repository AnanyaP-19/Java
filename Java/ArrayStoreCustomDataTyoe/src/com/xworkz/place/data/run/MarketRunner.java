package com.xworkz.place.data.run;
import com.xworkz.place.data.Market;
import com.xworkz.place.data.MarketData;
public class MarketRunner {

	public static void main(String[] args) {
		
		MarketData marketData=new MarketData();
		marketData.show();
		Market data1=new Market("RMC", "Shimoga");
		data1.print();
		Market data2=new Market("kr market","bangalore");
		data2.print();
		Market data3=new Market("bangalore market", "bangalore");
		data3.print();
		Market data4=new Market("mysore market","mysore");
		data4.print();
		Market data5=new Market("mangalore market", "mangalore");
		data5.print();
	}

}
