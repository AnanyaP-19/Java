class Robo
{
	public static double price(String medicineName)
	{
		System.out.println("running in method called price");
		System.out.println("medicineName:"+medicineName);
		if(medicineName=="Dolo650")
		{
			return 20;
		}
		if(medicineName=="Dolo250")
		{
			return 18;
		}
		if(medicineName=="Dolo350")
		{
			return 19;
		}
		
		return 21;
	}
	
	public static String name(String course)
	{
		System.out.println("running in method called name");
		System.out.println("course"+course);
		if(course=="Degree")
		{
			return "BE";
		}
		else
		{
			return "BCA";
		}
	}
	
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
			return ;
		}
		else
		{
			System.out.println(" age is above 18 ticketPrice is 1000");
			return;
		}
	}
}