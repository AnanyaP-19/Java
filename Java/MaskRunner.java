class MaskRunner
{
	public static void main(String[] args)
	{
		System.out.println("Started in the main method MaskRunner");
		
		Mask mask1=new Mask();
		Mask mask2=new Mask('S');
		Mask mask3=new Mask("Cotton");
		Mask mask4=new Mask(40,'M',"Cotton");
		Mask mask5=new Mask(30,'L');
		System.out.println("Ends in the main method MaskRunner");

	}
}