class Knife
{
	double weight;
	double height;
	
	public Knife(double weight,double height)
	{
	this.weight=weight;
	this.height=height;
	System.out.println("Created Knife");
	}
	
	public void visible()
	{
	System.out.println("Knife weight is:"+this.weight);
	System.out.println("Knife height is:"+this.height);
	}
}