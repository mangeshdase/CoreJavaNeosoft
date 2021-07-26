package com.corejava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,9,6,0}));
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] {1,2,7,4,5,6,7,5}));;
		
		//Union
		Set<Integer> union = new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println("Union: "+union);
		
		//Intersection
		Set<Integer> intersection = new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection: "+intersection);
		
		
		//Symmetric Difference
		Set<Integer> difference = new HashSet<Integer>(set1);
		difference.removeAll(set2);
		System.out.println("Difference :" +difference);
		
		
		
		System.out.println("2 is there? :"+difference.contains(2));
		System.out.println( "0 is removed :"+difference.remove(0));
		
		
		for(Integer i : difference) {
			System.out.println("Element : "+i );
		}
		
		
		Set<String> lhs = new LinkedHashSet<String>();
		lhs.add("Amit");
		lhs.add("Yogesh");
		lhs.add("Anita");
		lhs.add("Sanjay");
		lhs.add("Amit");
		
		System.out.println(lhs);
		
		lhs.remove("Anita");
		System.out.println(lhs);
		
		Iterator<String> itr = lhs.iterator();
		
 	}

}
