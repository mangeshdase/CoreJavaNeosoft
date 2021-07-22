package com.corejava;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		a = sc.nextInt();
		int arr[] = new int[a];
		System.out.print("Enter the 5 numbers :");
		
		for(int i =0 ;i<a;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Original Array :");
		for(int j : arr) {
			System.out.print(j+",");
		}
		for(int i =0; i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		System.out.println("Sorted array :");
		for(int j : arr) {
			System.out.print(j+ ",");
		}
		}
	}
