package com.xworkz.engineering;

public class Plant {

		private String name="Rose";
		private String type="real";
		private String family="rosaceace";
		private String category="shrubs";
		private String subFamily="rosoideae";
		private double height;
		private double length;
		private double width;
		private double cost;
		private int quantity;
		
		public Plant(double height,double length, double width,double cost,int quantity)
		{
			this.height=height;
			this.length=length;
			this.width=width;
			this.cost=cost;
			this.quantity=quantity;
		}
		
		public void show()
		{
			System.out.println("Rose name:"+this.name);
			System.out.println("Rose type:"+this.type);
			System.out.println("Rose family:"+this.family);
			System.out.println("Rose category:"+this.category);
			System.out.println("Rose subFamily:"+this.subFamily);
			System.out.println("Rose height:"+this.height);
			System.out.println("Rose length:"+this.length);
			System.out.println("Rose width:"+this.width);
			System.out.println("Rose cost:"+this.cost);
			System.out.println("Rose quantity:"+this.quantity);

		}
		
}
