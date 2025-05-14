package com.tania.co;

import com.tania.co.entity.Student;
import java.util.Scanner;

public class App {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		/*
		Student s1 = new Student();
		s1.setRoll(5);
		s1.setName("Tania Majumdar");
		s1.setMp(89.9);
		System.out.println(s1);
		Student s2 = new Student(10, "Arun Sen", 85.6);
		System.out.println(s2);
		
		Student s3 = (Student) Class.forName("com.tania.co.entity.Student").newInstance();
		s3.setRoll(15);
		s3.setName("Jayanta Sen");
		s3.setMp(75.5);
		System.out.println(s3);
		System.out.println();
		System.out.println("Roll of the student: "+s3.getRoll());
		System.out.println("Name of the student: "+s3.getName());
		System.out.println("Marks % of the student: "+s3.getMp());
		*/
		
		Student s[] = new Student[3]; // array of reference to Student
		for(int i=0; i<s.length; i++) {
//			System.out.print("Enter roll:: ");
//			int roll = Integer.parseInt(sc.nextLine());
			System.out.print("Enter name:: ");
			String name = sc.nextLine();
			System.out.print("Enter marks %:: ");
			double mp = Double.parseDouble(sc.nextLine());
//			s[i] = new Student(roll, name, mp);
			s[i] = new Student(name, mp);
		}
		System.out.println();
		System.out.println("Student Information::");
//		for(int i=0; i<s.length; i++) {
//			System.out.println(s[i]);
//		}
		// for each loop
		for(Student std : s) {
			System.out.println(std);
		}
		
	}

}
