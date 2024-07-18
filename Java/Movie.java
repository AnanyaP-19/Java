class Movie
{
	public static void ticket()
	{
		int age = 18;
		String name = "kalki";
		double ticketPrice =1000;
		System.out.println("age:"+age);
		System.out.println("name:"+name);
		if(age<18)
		{
			System.out.println(" age is below 18 ticketPrice is less than 1000");
		}
		else
		{
			System.out.println(" age is above 18 ticketPrice is 1000");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("running in main method");
		ticket();
	}
}
