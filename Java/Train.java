class Train
{
	public static void book(String source, String destination)
	{
		System.out.println("parameter having two string methods");
		System.out.println("Source:" + source);
		System.out.println("Destination:" + destination);
	}
	
	public static void book(String source, String destination, int quantity)
	{
		System.out.println("parameter having two string methods and one int method");
		System.out.println("Source:" + source);
		System.out.println("Destination:" + destination);
		System.out.println("Quantity:" + quantity);
	}
	
	public static void book(String source, String destination, int quantity, double price)
	{
		System.out.println("parameter having two string methods ,int method and one double method");
		System.out.println("Source:" + source);
		System.out.println("Destination:" + destination);
		System.out.println("Quantity:" + quantity);
		System.out.println("Price:" + price);
	}
	
	public static void cancel(int ticketNo)
	{
		System.out.println("parameter having one int method");
		System.out.println("TicketNo:" + ticketNo);	
	}
	
	public static void cancel(String source, String destination)
	{
		System.out.println("parameter having two string methods");
		System.out.println("Source:" + source);
		System.out.println("Destination:" + destination);
		
	}
}