package com.corejava;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Object> clist = new LinkedList<Object>(
		Arrays.asList(null,"abc",100,10.87,true));
	clist.add(2,"java");
	clist.addFirst("OK");
	clist.removeLast();
	System.out.println(clist.getLast());
	System.out.println(clist.contains("java"));
	for(Object obj: clist)
		System.out.println("Element :"+obj);
 	}

}
