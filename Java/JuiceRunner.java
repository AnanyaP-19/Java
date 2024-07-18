class JuiceRunner
{
	public static void main(String[] args)
	{
		System.out.println("runnin in main method");
		if(args.length==5)
		{
		String name=args[0];
		String brand=args[1];
		String flavour=args[2];
		String price=args[3];
		String quantity=args[4];
		double updatedPrice=Double.parseDouble(price);
		int updatedQuantity=Integer.parseInt(quantity);
		Juice.info(name,brand,flavour,updatedPrice,updatedQuantity);
		}
		else
		{
			System.out.println("it does not store info");
		}
	}
}