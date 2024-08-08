class Keybunch
{
	String material;
	Key key;
	
	public Keybunch(String material,Key key)
	{
		this.material=material;
		this.key=key;
		System.out.println("Created Keybunch using argument constructor");
	}
	
	public void keybunchDisplay()
	{
	System.out.println("Keybunch material is:"+this.material);
	this.key.display();
	}
}