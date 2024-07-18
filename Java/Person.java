class Person
{
	public static void main(String[] person)
	{
		System.out.println("running in main method");
		if(person.length==4)
		{
			String names=person[0];
			String email=person[1];
			int age=21;
			String ref =""+age;
			
			String password=person[3];
			System.out.println("names:"+names);
			System.out.println("email:"+email);
			System.out.println("age:"+ref);
			System.out.println("password:"+password);
			System.out.println("store all information");
		}
		else
		{
			System.out.println("does not store all in");
		}
	}
}