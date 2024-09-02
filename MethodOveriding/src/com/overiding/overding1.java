package com.overiding;

public class overding1 extends Overriding {

	private void room3() {
		// TODO Auto-generated method stub
System.out.println("this is room 3");
	}
	@Override
	public void room1() {
		System.out.println("this is room4");
	}
	
	@Override
	public void room2() {
		// TODO Auto-generated method stub
		super.room2();
	}
	
	public static void main(String[] args) {
		overding1 obj = new overding1();
		obj.room1();
		obj.room2();
		obj.room3();
		
	}
}
