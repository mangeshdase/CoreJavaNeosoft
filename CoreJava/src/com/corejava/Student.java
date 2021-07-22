package com.corejava;

import java.util.Scanner;

public class Student {
	
	int stid;
	String name;
	String course;
	int marks;
	public int getStid() {
		return stid;
	}

	public Student(int stid, String name, String course, int marks) {
		super();
		this.stid = stid;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student() {
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stud = new Student[5];
		for(int i=0 ; i<5; i++) {
			System.out.print("Enter student id - ");
			int stid = sc.nextInt();
			System.out.println();
			
			System.out.print("Enter student name - ");
			String name = sc.next();
			System.out.println();

			System.out.print("Enter student course - ");
			String course = sc.next();
			System.out.println();
			
			System.out.print("Enter student marks - ");
			int marks = sc.nextInt();
			System.out.println("---");
			
			Student stud1 = new Student(stid, name, course, marks);
			
			stud[i] = stud1;
		}

		showStudents(stud);
		
	}

	private static void showStudents(Student[] stud) {
		// TODO Auto-generated method stub
		for(int i=0;i<stud.length;i++) {
			System.out.println(stud[i].stid+","+stud[i].name+","+stud[i].course+","+stud[i].marks);
		}
		
	}

}
