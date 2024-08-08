class KnifeRunner
{
	public static void main(String[] args)
	{
		Knife knife1=new Knife(1,1.2);
		Ananya ananya1=new Ananya(90195205,knife1);
		ananya1.ananyaVisible();
		System.out.println("===");
		Knife knife2=new Knife(2,2.2);
		Ananya ananya2=new Ananya(99455848,knife2);
		ananya2.ananyaVisible();
	}
}