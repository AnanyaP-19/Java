class Clip
{
	String color;
	String type;
	
	public Clip(String color,String type)
	{
		this.color=color;
		this.type=type;
		System.out.println("Created Clip");
	}
	
	public void show()
	{
		System.out.println("Clip color is:"+this.color);
		System.out.println("Clip type is:"+this.type);
	}
}