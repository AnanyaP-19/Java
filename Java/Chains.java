class Chains
{
	public static double carat()
	{
		double carat = 24;
		System.out.println("carat:"+carat);
		return carat;
	}
	
	public static double costPerGram()
	{
		double costPerGram = 60000;
		System.out.println("costPerGram:"+costPerGram);
		return costPerGram;
	}
	
	public static String type()
	{
		String type = "Gold";
		System.out.println("type:"+type);
		return type;
	}
	
	public static String quality()
	{
		String quality = "premium";
		System.out.println("quality:"+quality);
		return quality;
	}
	
	public static int quantity()
	{
		int quantity = 1;
		System.out.println("quantity:"+quantity);
		return quantity;
	}
	
	public static double wastage()
	{
		double wastage = 12;
		System.out.println("wastage:"+wastage);
		return wastage;
	}
	
	public static double serviceCharge()
	{
		double serviceCharge = 5000;
		System.out.println("serviceCharge:"+serviceCharge);
		return serviceCharge;
	}
	
	public static double gst()
	{
		double gst = 12.4;
		System.out.println("gst:"+gst);
		return gst;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("running in main method");
		double carat = Chains.carat();
		double ref2 = Chains.costPerGram();
		String ref3 = Chains.type();
		String ref4 = Chains.quality();
		int ref5 = Chains.quantity();
		double wastage = Chains.wastage();
		double serviceCharge = Chains.serviceCharge();
		double gst = Chains.gst();
	}
}