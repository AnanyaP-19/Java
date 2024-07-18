class Blood
{
	public static String group()
	{
		String group = "B+";
		System.out.println("group:"+group);
		return group;
	}
	
	public static String personName()
	{
		String personName = "Ananya";
		System.out.println("personName:"+personName);
		return personName;
	}
	
	public static double cost()
	{
		double cost = 20;
		System.out.println("cost:"+cost);
		return cost;
	}
	
	public static String hospitalTested()
	{
		String hospitalTested = "Governament";
		System.out.println("hospitalTested:"+hospitalTested);
		return hospitalTested;
	}
	
	public static boolean sickness()
	{
		boolean sickness = false;
		System.out.println("sickness:"+sickness);
		return sickness;
	}
	
	public static boolean donate()
	{
		boolean donate = true;
		System.out.println("donate:"+donate);
		return donate;
	}
	
	public static void main(String[] args)
	{
		System.out.println("running in main method");
		String ref = Blood.group();
		String ref2 = Blood.personName();
		double ref3 = Blood.cost();
		String ref4 = Blood.hospitalTested();
		boolean ref5 = Blood.sickness();
		boolean ref6 = Blood.donate();
	}
}