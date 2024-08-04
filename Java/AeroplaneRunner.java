class AeroplaneRunner
{
	public static void main(String[] args)
	{
		System.out.println("Started in the main method AeroplaneRunner");
		
		Aeroplane aeroplane1=new Aeroplane();
		Aeroplane aeroplane2=new Aeroplane("AIRINDIA",200,2000,"Shivamogga","Bengaluru");
		Aeroplane aeroplane3=new Aeroplane("VISTARA","Bengaluru","Shivamogga");
		Aeroplane aeroplane4=new Aeroplane("EMERATES",25000,"Bengaluru","Germany");
		System.out.println("Ends in the main method AeroplaneRunner");

	}
}