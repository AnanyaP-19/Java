class SimCard
{
	double price;
	int quantity;
	String brand;
	
	public SimCard(double priceLoad,int quantityLoad,String brandLoad)
	{
		System.out.println("Created SimCard");
		price=priceLoad;
		quantity=quantityLoad;
		brand=brandLoad;
	}
}