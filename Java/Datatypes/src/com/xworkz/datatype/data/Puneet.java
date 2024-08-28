package com.xworkz.datatype.data;

public class Puneet {
  public Hat hat;
  public int age;
  public void fold()
  {
	  if(hat!=null) {
	  hat.shade();
	  System.out.println(hat.color);
  }
	  else {
		  System.out.println("Hat is null");
	  }
  }
}
