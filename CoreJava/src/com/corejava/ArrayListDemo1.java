package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Studentss> studentlist = new ArrayList<Studentss>();
		studentlist.add(new Studentss(101,"abc1","java",90));
		studentlist.add(new Studentss(102,"abc2","java",94));
		studentlist.add(new Studentss(103,"abc3","java",93));
		studentlist.add(new Studentss(104,"abc4","java",92));
		studentlist.add(new Studentss(105,"abc5","java",94));
		
		
		
		Iterator<Studentss> itr = studentlist.iterator();
		
		while(itr.hasNext()) {
			Studentss student = itr.next();
			System.out.print("ID :"+student.stid+",");
			System.out.print("Name :"+student.name+",");
			System.out.print("Course :"+student.course+",");
			System.out.print("Marks :"+student.marks+"\n");
		}
		studentlist.clear();
		
//		List<object> complexList = Arrays.asList(null,"abc", 100,10.25,true);
//		for(Object obj: complexList)
//			System.out.println("elements :"+obj);
		
		
		/*separate*/
//		List<Object> comList = new ArrayList<Object>(
//				Arrays.asList(null,"abc",101,10.23,true));
//		comList.add(2,"Java");
//		comList.remove(4);
//		for(Object obj: comList)
//			System.out.println("Element :"+obj);
		
	}

}
class Studentss{
	int stid;
	String name;
	String course;
	int marks;
	public Studentss(int stid, String name, String course, int marks) {
		super();
		this.stid = stid;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}
	
	
	
}
