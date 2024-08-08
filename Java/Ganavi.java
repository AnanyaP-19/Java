class Ganavi
{
	String email;
	Clip clip;
	
	public Ganavi(String email,Clip clip)
	{
	this.email=email;
	this.clip=clip;
	System.out.println("Created Ganavi");
	}
	
	public void ganaviShow()
	{
	System.out.println("Ganavi email is:"+this.email);
	this.clip.show();
	}
}