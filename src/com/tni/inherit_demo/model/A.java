package com.tni.inherit_demo.model;

public class A {
	private int x;
	public int y=50;
	public A() {
		super();
		System.out.println("Without argument constructor in A");
	}
	public A(int x) {
		super();
		System.out.println("With argument constructor in A");
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String info() {
		return "A [x=" + x + "]";
	}
	public void show() {
		System.out.println("show() in A");
	}
}
