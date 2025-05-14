package com.tania.co.entity;

public class Student {
	private int roll;
	private String name;
	private double mp;
	private static int counter;
	static { // static block
		counter = 1000;
	}
	{ // initialization block
//		System.out.println("Initialization Block...");
		this.roll = ++counter;
	}
	public Student() {
		super(); // Calling the parent constructor => Object
		System.out.println("without argument parameter...");
	}
	/*
	public Student(int roll, String name, double mp) {
		super();
		System.out.println("With argument constructor...");
		this.roll = roll;
		this.name = name;
		this.mp = mp;
	}
	*/
	public Student(String name, double mp) {
//		super();
		this();
		System.out.println("With argument constructor...");
		this.name = name;
		this.mp = mp;
	}
	@Override
	public String toString() {
		return "Student [roll=" + this.roll + ", name=" + this.name + ", mp=" + this.mp + "]";
	}
	public int getRoll() {
		return roll;
	}
//	public void setRoll(int roll) {
//		this.roll = roll;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMp() {
		return mp;
	}
	public void setMp(double mp) {
		this.mp = mp;
	}
}
