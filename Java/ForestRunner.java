class ForestRunner
{
	public static void main(String[] forest)
	{
		System.out.println("running in main method");
		if(forest.length==4)
		{
			String names=forest[0];
			String area=forest[1];
			String establishedYear=forest[2];
			String state=forest[3];
			System.out.println("name:"+names);
			System.out.println("area:"+area);
			System.out.println("establishedYear:"+establishedYear);
			System.out.println("state:"+state);
			System.out.println("store all information");
		}
		else
		{
			System.out.println("does not store all in");
		}
	}
}