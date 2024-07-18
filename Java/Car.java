class Car
{
public static String name(double price)
{

System.out.println("price:"+price);
if(price<1300000)
{

return "Car is costly";
}
else
{
return"Car is offerdable";
}
}
public static void main(String[] args)
{
	System.out.println("running in main method");
	String name=Car.name(1000000);
	System.out.println("name:"+name);
}
}
