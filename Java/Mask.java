class Mask
{
	double cost;
	char size;
	String material;
	
	public Mask()
	{
		System.out.println("Created Mask");
	}
	
	public Mask(char size)
	{
		System.out.println("Created Mask");
		this.size=size;
		System.out.println("Mask size is:"+this.size);
	}
	
	public Mask(String material)
	{
		System.out.println("Created Mask");
		this.material=material;
		System.out.println("mask material used is:"+this.material);
	}
	
	public Mask(double cost,char size,String material)
	{
		System.out.println("Created Mask");
		this.cost=cost;
		this.size=size;
		this.material=material;
		System.out.println("mask cost is:"+this.cost);
		System.out.println("Mask size is:"+this.size);
		System.out.println("mask material used is:"+this.material);
	}
	
	public Mask(double cost,char size)
	{		
		System.out.println("Created Mask");
		this.cost=cost;
		this.size=size;
		System.out.println("mask cost is:"+this.cost);
		System.out.println("Mask size is:"+this.size);
	}
}