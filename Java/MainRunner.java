class MainRunner
{
	public static void main(String[] args)
	{
		// paint
		System.out.println("running in mainmethod");
		Paint.organic("Asian Paint");
		Paint.semiOrganic("Neppon","Blue");
		Paint.pureOrganic("Birla", 45000.00);
		Paint.unOrganic("Grey" ,"mat" , 60000.00);
		// train 
		Train.book("Bengaluru", "Shivamogga");
		Train.book("Hubli", "Shivamogga",1);
		Train.book("Bengaluru", "Hubli" , 2 ,400.53);
		Train.cancel(203);
		Train.cancel("Bengaluru", "Shivamogga");
	    // yourwish
		
		YourWish.job("Software Develpper");
		YourWish.book("AABBCCDD");
		YourWish.amount(500000.589);
		YourWish.sport("Cricket");
		YourWish.fruit("Apple", 200.50);
	}
}