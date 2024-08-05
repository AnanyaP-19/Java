class Resort
{
	static double sRoomPrice=1000;
	static double mRoomPrice=2000;
	static double wRoomPrice=3000;
	static double foodPrice=500;
 public static double price(String packages,boolean addFood)
 {
	 double total=0;
	if(packages=="Summer")
	{
		if(addFood==true)
		{
		total=sRoomPrice+foodPrice;
		return total;
		}
	
		else
		{
		return sRoomPrice;
		}
	}
			
	
	if(packages=="Mansoon")
	{
		if(addFood==true)
		{
		total=mRoomPrice+foodPrice;
		return total;
		}
	
		else
		{
		return mRoomPrice;
		}
	}

	if(packages=="Winter")
	{
		if(addFood==true)
		{
		total=wRoomPrice+foodPrice;
		return total;
		}
	
		else
		{
		return wRoomPrice;
		}
	
	}	
		
		return 0;
}
 }
