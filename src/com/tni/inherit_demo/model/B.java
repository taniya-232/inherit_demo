package com.tni.inherit_demo.model;

public class B extends A {
	private int y;
	public B() {
		super();
		System.out.println("Without argument constructor in B");
	}
	public B(int x, int y) {
		super(x);
		System.out.println("With argument constructor in B");
		this.y = y;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "A [x=" + getX() + "] <- B [y=" + y + "]";
	}
	@Override
	public void show() {
		super.show();
		System.out.println("show() in B");
	}
	public void printY() {
		System.out.println("y of A :: "+super.y);
		System.out.println("y of B :: "+this.y);
	}
}
