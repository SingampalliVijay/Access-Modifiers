package com.kn.modifiers2;

import com.kn.modifiers1.Demo1;

public class Demo4 extends Demo1 {

	public void display4() {
		   System.out.println("Demo4 a ="+a);
		   System.out.println("Demo4 b ="+b);
//		   System.out.println("Demo4 c ="+c);  --> Since it is Package
//		   System.out.println("Demo4 d ="+d);  --> Sicne it is Private
	   }
}
