class Ananya
{
	long mobile;
	Knife knife;
	
	public Ananya(long mobile,Knife knife)
	{
	this.mobile=mobile;
	this.knife=knife;
	System.out.println("Created Ananya");
	}
	
	public void ananyaVisible()
	{
	System.out.println("Ananya mobile is"+this.mobile);
	this.knife.visible();
	}
}