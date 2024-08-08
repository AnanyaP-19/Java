class Key
{
	double weight;
	String brand;
	
	public Key(double weight,String brand)
	{
		this.weight=weight;
		this.brand=brand;
		System.out.println("Created Key using argument constructor");
	}
	
	public void display()
	{
		System.out.println("Key weight is:"+this.weight);
		System.out.println("key brand is:"+this.brand);
	}
}