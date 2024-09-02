package com.overiding;

public class Overriding {
	public  static int room1() {
		// TODO Auto-generated method stub
System.out.println("this is room1");
return 0;
	}
	
	public static void room2() {
		// TODO Auto-generated method stub
System.out.println("this is room2");
	}
	public static void room3() {
		// TODO Auto-generated method stub
System.out.println("this is room2");
	}
	public static void room4() {
		// TODO Auto-generated method stub
System.out.println("this is room2");
	}

	public static void main(String[] args) {
		Overriding.room1();
		Overriding.room2();
		Overriding.room3();
		Overriding.room4();
		
	}
	
}
