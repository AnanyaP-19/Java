class Kerosene
{
	double price;
	int quantity;
	boolean quality;
	
	public Kerosene()
	{
		System.out.println("Created Kerosene");
	}
	
	public Kerosene(double price,int quantity,boolean quality)
	{
		System.out.println("Created Kerosene");
		this.price=price;
		this.quantity=quantity;
		this.quality=quality;
		System.out.println("Kerosene price is:"+this.price);
		System.out.println("Kerosene quantity is:"+this.quantity);
		System.out.println("Kerosene quality is:"+this.quality);

	}
	
	public Kerosene(boolean quality)
	{
		System.out.println("Created Kerosene");
		this.quality=quality;
		System.out.println("Kerosene quality is:"+this.quality);
	}
	
	public Kerosene(double price)
	{
		System.out.println("Created Kerosene");
		this.price=price;
		System.out.println("Kerosene price is:"+this.price);

	}
	
	
}