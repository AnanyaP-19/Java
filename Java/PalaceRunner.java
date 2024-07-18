class PalaceRunner
{
	public static void main(String[] palace)
	{
		System.out.println("running in main method");
		if(palace.length==4)
		{
			String names=palace[0];
			String location=palace[1];
			String builtYear=palace[2];
			String builtBy=palace[3];
			System.out.println("names:"+names);
			System.out.println("location:"+location);
			System.out.println("builtYear:"+builtYear);
			System.out.println("builtBy:"+builtBy);
			System.out.println("store all information");
		}
		else
		{
			System.out.println("does not store all in");
		}
	}
}
