class ClipRunner
{
public static void main(String[] args)
{
	Clip clip1=new Clip("Black","Metal");
	Ganavi ganavi1=new Ganavi("ganavi1@gmail.com",clip1);
	ganavi1.ganaviShow();
	System.out.println("======");
	Clip clip2=new Clip("Brown","Plastic");
	Ganavi ganavi2=new Ganavi("ganavi2@gmail.com",clip2);
	ganavi2.ganaviShow();
}
}