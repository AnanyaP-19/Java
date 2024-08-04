class Aeroplane
{
	String company;
	int noOfSeats;
	double ticketPrice;
	String source;
	String destination;
	
	public Aeroplane()
	{
		System.out.println("Created Aeroplane");
	}
	
	public Aeroplane(String company,int noOfSeats,double ticketPrice,String source,String destination)
	{
		System.out.println("Created Aeroplane");
		this.company=company;
		this.noOfSeats=noOfSeats;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
		System.out.println("Aeroplane company is:"+this.company);
		System.out.println("Aeroplane noOfSeats is:"+this.noOfSeats);
		System.out.println("Aeroplane ticketPrice is:"+this.ticketPrice);
		System.out.println("Aeroplane source is:"+this.source);
		System.out.println("Aeroplane destination is:"+this.destination);

	}
	
	public Aeroplane(String company,String source,String destination)
	{
		System.out.println("Created Aeroplane");
		this.company=company;
		this.source=source;
		this.destination=destination;
		System.out.println("Aeroplane company is:"+this.company);
		System.out.println("Aeroplane source is:"+this.source);
		System.out.println("Aeroplane destination is:"+this.destination);

	}
	
	public Aeroplane(String company,double ticketPrice,String source,String destination)
	{
		System.out.println("Created Aeroplane");
		this.company=company;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
		System.out.println("Aeroplane company is:"+this.company);
		System.out.println("Aeroplane ticketPrice is:"+this.ticketPrice);
		System.out.println("Aeroplane source is:"+this.source);
		System.out.println("Aeroplane destination is:"+this.destination);

	}
	
	
}