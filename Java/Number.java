class Number
{
	public static void check()
	{
	   int values = 5;
	   System.out.println("checking for the number is even or odd");
	   System.out.println("Values:"+ values);
	   if(values%2==0)
	   {
		System.out.println("print odd");
	   } 
	   else
	   {
	   	System.out.println("print even");
	   }

	}
	
	public static void main(String[] args)
	{
	 System.out.println("running in main method");
	 check();
	}
}
