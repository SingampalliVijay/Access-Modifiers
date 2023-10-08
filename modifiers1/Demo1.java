package com.kn.modifiers1;

public class Demo1 {

	public int a=10;
	protected int b=20;
	   int c=30;    // --> Default or Package
	private int d=40;
	 
   public void display1() {
	   System.out.println("Demo1 a ="+a);
	   System.out.println("Demo1 b ="+b);
	   System.out.println("Demo1 c ="+c);
	   System.out.println("Demo1 d ="+d);
   }
}
