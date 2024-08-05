class ResortRunner
{
	public static void main(String[] args)
	{
		
		double price1=Resort.price("Summer",true);
		System.out.println("Summer:"+price1);
		double price2=Resort.price("Mansoon",true);
		System.out.println("Mansoon:"+price2);
		double price3=Resort.price("Winter",true);
		System.out.println("Winter:"+price3);

	}
	
}