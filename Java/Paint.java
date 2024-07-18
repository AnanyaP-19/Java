class Paint
{
	public static void organic(String brand)
	{
		System.out.println("parameter having one string method");
		System.out.println("Brand:" + brand);
	}
	
	public static void semiOrganic(String brand,String color)
	{
		System.out.println("parameter having two string method");
		System.out.println("Brand:" + brand);
		System.out.println("Color:" + color);
	}
	
	public static void pureOrganic(String brand,double price)
	{
		System.out.println("parameter having one string method and one double method");
		System.out.println("Brand:" + brand);
		System.out.println("Price:" + price);
	}
	
	public static void unOrganic(String color,String type, double price)
	{
		System.out.println("parameter having two string method and one double method");
		System.out.println("Color:" + color);
		System.out.println("Type:" + type);
		System.out.println("Price:" + price);
	}
	
	
}