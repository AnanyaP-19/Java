class MainRunner2
{
	public static void main(String[] args)
	{
		System.out.println("running in main method");
		
		Charger charger=new Charger();
		charger.quantity=2;
		charger.name="REDMI";
		System.out.println("charger quantity is:"+charger.quantity);
		System.out.println("charger name is:"+charger.name);
		System.out.println("charger price is:"+charger.price);
		
		Claw claw=new Claw();
		claw.quantity=3;
		claw.price=5000;
		System.out.println("claw quantity is:"+claw.quantity);
		System.out.println("claw price is:"+claw.price);
		System.out.println("claw name is:"+claw.name);
		
		Crow crow=new Crow();
		crow.name="PavitraGowda";
		crow.price=1000;
		System.out.println("crow name is:"+crow.name);
		System.out.println("crow price is"+crow.price);
		System.out.println("crow name is"+crow.quantity);
		
		Clock clock=new Clock();
		clock.quantity=3;
		clock.name="Titan";
		System.out.println("clock quantity is:"+clock.quantity);
		System.out.println("clock price is:"+clock.name);
		System.out.println("clock name is:"+clock.price);
		
		Lolipop lolipop=new Lolipop();
		lolipop.quantity=5;
		lolipop.name="ChupaChup";
		System.out.println("lolipop quantity is:"+lolipop.quantity);
		System.out.println("lolipop price is:"+lolipop.name);
		System.out.println("lolipop name is:"+lolipop.price);
		
		Jean jean=new Jean();
		jean.quantity=1;
		jean.name="LEVIES";
		System.out.println("jean quantity is:"+jean.quantity);
		System.out.println("jean price is:"+jean.name);
		System.out.println("jean name is:"+jean.price);
		
		Keyboard keyboard=new Keyboard();
		keyboard.quantity=2;
		keyboard.name="HP";
		System.out.println("keyboard quantity is:"+keyboard.quantity);
		System.out.println("keyboard price is:"+keyboard.name);
		System.out.println("keyboard name is:"+keyboard.price);
		
		Mountain mountain = new Mountain();
		mountain.quantity=5;
		mountain.price=250;
		System.out.println("mountain quantity is:"+mountain.quantity);
		System.out.println("mountain price is:"+mountain.price);
		System.out.println("mountain name is:"+mountain.name);
		
		Stadium stadium = new Stadium();
		stadium.quantity=2;
		stadium.price=50000;
		System.out.println("stadium quantity is:"+stadium.quantity);
		System.out.println("stadium price is:"+stadium.price);
		System.out.println("stadium name is:"+stadium.name);
		
		Spray spray=new Spray();
		spray.name="MOVE";
		spray.price=180;
		System.out.println("spray quantity is:"+spray.name);
		System.out.println("spray price is:"+spray.price);
		System.out.println("spray name is:"+spray.quantity);
	}
}