package com.corejava;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1; i<=4 ; i++) {
			for(int j = 3; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
	}

}
