class KeyRunner
{
public static void main(String[] args)
{
	Key key=new Key(20,"KIA");
	Keybunch keybunch=new Keybunch("Leather",key);
	keybunch.keybunchDisplay();
	System.out.println("======");
	Key key1=new Key(25,"Maruti");
	Keybunch keybunch1=new Keybunch("Plastic",key1);
	keybunch1.keybunchDisplay();
}
}