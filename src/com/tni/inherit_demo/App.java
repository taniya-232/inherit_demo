package com.tni.inherit_demo;

import com.tni.inherit_demo.model.B;

public class App {

	public static void main(String[] args) {
		B obj1 = new B();
		obj1.setX(10);
		obj1.setY(100);
		System.out.println(obj1.getX()+"==========="+obj1.getY());
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj1.getClass().getName()+"@"+Integer.toHexString(obj1.hashCode()));
	}

}
