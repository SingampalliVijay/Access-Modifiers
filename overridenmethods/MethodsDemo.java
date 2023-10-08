package com.kn.overridenmethods;

public class MethodsDemo {

	public static void main(String[] args) {
	
	Parent p1=new Parent();
	System.out.println();
	System.out.println("<--- Parent --->");
	p1.skinColor();
	p1.height();
	p1.eyeColor();
	p1.weight();
	System.out.println();
	Child c1=new Child();
	System.out.println("<--- Child --->");
	c1.skinColor();
	c1.height();
	c1.eyeColor();
	c1.weight();
	c1.insta();
	c1.pubg();

	}

}
