class Mentoring1Runner
{
public static void days(String name,int no)
{
System.out.println("running in days method");
System.out.println("names:"+name);
System.out.println("numbers:"+no);
}
public static void days1(float height,double price,char section)
{
System.out.println("running in days1 method");
System.out.println("height:"+height);
System.out.println("price:"+price);
System.out.println("section:"+section);
}
public static void main(String[] args)
{
System.out.println("running in main method");
Mentoring1.days("Ananya",1);
Mentoring1.days1(163.64F,25000,'A');
}
}
