class Mentoring1Runner
{
public static void days(String name,double price)
{
System.out.println("running in days method");
System.out.println("names:"+name);
System.out.println("price:"+price);
}
public static String days(int no,char section,float height)
{
System.out.println("running in days1 method");
System.out.println("no:"+no);
System.out.println("section:"+section);
System.out.println("height:"+height);
if(height==7F)
{
	return"he is a tall guy";
	
}
else
{
	return"he is a short guy";
}
}
public static void main(String[] args)
{
System.out.println("running in main method");
Mentoring1Runner.days("Ananya",25000);
String ref= Mentoring1Runner.days(128,'A',7F);
System.out.println("ref:"+ref);
}
}
