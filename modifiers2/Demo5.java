package com.kn.modifiers2;

import com.kn.modifiers1.Demo1;

public class Demo5 {
 
	Demo1 d1=new Demo1();
	public void display5() {
		   System.out.println("Demo5 a ="+d1.a);
//		   System.out.println("Demo5 b ="+d1.b);  --> Since it is Protected
//		   System.out.println("Demo5 c ="+d1.c);  --> Since it is Package
//		   System.out.println("Demo5 d ="+d1.d);  --> Since it is Private
	   }
}
