class Sweets
{
	public static void main(String[] args)
	{
		System.out.println("running in main method");
		String Sweet1="jalebi";
		System.out.println("Sweet1:"+ Sweet1);
		String Sweet2="champakali";
		System.out.println("Sweet2:"+ Sweet2);
		String Sweet3="laddu";
		System.out.println("Sweet3:"+ Sweet3);
		String Sweet4="peda";
		System.out.println("Sweet4:"+ Sweet4);
		String Sweet5="kardantu";
		System.out.println("Sweet5:"+ Sweet5);
		String Sweet6="dharwadpeda";
		System.out.println("Sweet6:"+ Sweet6);
		String Sweet7="rasgulla";
		System.out.println("Sweet7:"+ Sweet7);
		String Sweet8="rasmalai";
		System.out.println("Sweet8:"+ Sweet8);
		String Sweet9="milkcake";
		System.out.println("Sweet9:"+ Sweet9);
		String Sweet10="kajukatli";
		System.out.println("Sweet10:"+ Sweet10);
		
		
		String[] container={Sweet1,Sweet2,Sweet3,Sweet4,Sweet5,Sweet6,Sweet7,Sweet8,Sweet9,Sweet10};
		int ref=container.length;
		System.out.println("ref:"+ ref);
		String search = container[9];
		System.out.println("search:"+ search);
	}
}