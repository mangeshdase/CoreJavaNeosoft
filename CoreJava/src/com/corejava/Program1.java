package com.corejava;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int num =a;
		int rem, revernum=0;
		while(a !=0) {
			rem = a % 10;
			revernum = revernum*10 + rem;
			a = a/10;
			}
		if( num == revernum) {
			System.out.println(+num+" is palindrom number");
		}
		else {
			System.out.println(+num+" is not palindrom");
		}
	}

}
