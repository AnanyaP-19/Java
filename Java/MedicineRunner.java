class MedicineRunner
{
	public static void main(String[] args)
	{
		System.out.println("runnin in main method");
		if(args.length==4)
		{
		String name=args[0];
		String manfDate=args[1];
		String price=args[2];
		String quantity=args[3];
		double updatedPrice=Double.parseDouble(price);
		int updatedQuantity=Integer.parseInt(quantity);
		Medicine.info(name,manfDate,updatedPrice,updatedQuantity);
		}
		else
		{
			System.out.println("it does not store info");
		}
	}
}