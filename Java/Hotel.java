class Hotel
{
	String name="ISIRI";
	Owner owner=new Owner("Ananya",21,'F');
	
	Hotel()
	{
		System.out.println("Created Hotel without argument constructor");
	}
	
	public void showHotel()
	{
		System.out.println("Hotel name is:"+name);
		this.owner.show();
	}
}