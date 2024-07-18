class Pg
{
	public static void door()
	{
		System.out.println("way to enters pg");
		gate();
		room();
	
	}
	public static void gate()
	{
		System.out.println("way to enter pg");
		room();
		door();
	}
	public static void room()
	{
		System.out.println("which is there in pg");
		door();
		gate();
		
	}
	public static void main(String[] args)
	{
		System.out.println("place to leave");
		Pg.room();
		
		
	}
}
