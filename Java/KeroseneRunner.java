class KeroseneRunner
{
	public static void main(String[] args)
	{
		System.out.println("Started in the main method KeroseneRunner");
		
		Kerosene kerosene1=new Kerosene();
		Kerosene kerosene2=new Kerosene(100,250,true);
		Kerosene kerosene3=new Kerosene(true);
		Kerosene kerosene4=new Kerosene(50);
		System.out.println("Ends in the main method KeroseneRunner");

	}
}