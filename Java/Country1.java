class Country1
{
	public static void statesNames(String[] states)
	{
		System.out.println("start the method");
	
		for(int start=states.length-1;start>=0;start--)
		{
			String ref=states[start];
			System.out.println("State Names:"+ref);
		}
		System.out.println("ends the method");
	}
	
    public static void pincode(int[] pincodes)
	{
		System.out.println("start the method");

		for(int begin=pincodes.length-1;begin>=0;begin--)
		{
			int ref1=pincodes[begin];
			System.out.println("State pincodes:"+ref1);
		}
		System.out.println("ends the method");
	}
	
	public static void primeMinister(String[] primeMinisters)
	{
		System.out.println("start the method");
		
		for(int run=primeMinisters.length-1;run>=0;run--)
		{
			String ref2=primeMinisters[run];
			System.out.println("PrimeMinisters of India:"+ref2);
		}
		System.out.println("ends the method");
	}
	
	public static void cabinetMinister(String[] cabinetMinisters)
	{
		System.out.println("start the method");
		
		for(int name=cabinetMinisters.length-1;name>=0;name--)
		{
			String ref3=cabinetMinisters[name];
			System.out.println("PrimeMinisters of India:"+ref3);
		}
		System.out.println("ends the method");
	}
	
	public static void politicalParty(String[] politicalParties)
	{
		System.out.println("start the method");
		
		for(int name1=politicalParties.length-1;name1>=0;name1--)
		{
			String ref4=politicalParties[name1];
			System.out.println("politicalParties of India:"+ref4);
		}
		System.out.println("ends the method");
	}
}