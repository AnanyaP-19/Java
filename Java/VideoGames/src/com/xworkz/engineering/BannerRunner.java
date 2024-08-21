package com.xworkz.engineering;
import com.xworkz.engineering.Banner;
public class BannerRunner {

	public static void main(String[] args) {
		Banner banner1=new Banner(21,"red",2000);
		Banner banner2=new Banner(22,"blue",3000);
		Banner banner3=new Banner(23,"grey",5000);

		Banner banner[]= {banner1,banner2,banner3};
		System.out.println("Banner length:"+banner.length);
		
		for(int start=0;start<banner.length;start++)
		{
			Banner ref=banner[start];
			ref.show();
		}
	}

}
