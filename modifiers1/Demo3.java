package com.kn.modifiers1;

public class Demo3 {
 
	Demo1 d1=new Demo1();
	public void display3() {
		   System.out.println("Demo3 a ="+d1.a);
		   System.out.println("Demo3 b ="+d1.b);
		   System.out.println("Demo3 c ="+d1.c);
//		   System.out.println("Demo3 d ="+d1.d); --> Since it is Private
	   }
}

