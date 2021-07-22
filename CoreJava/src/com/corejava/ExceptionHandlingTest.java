package com.corejava;

public class ExceptionHandlingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
userDefinedException();
		
	}
		private static void userDefinedException() {
			try {
				int a= 10;
				int b =0;
				if(b==0)
					throw new DivideByZeroException("B shoulde not be zero");
				System.out.print(a/b);
			}
			catch(DivideByZeroException e) {
				System.out.println(e);
				
		}
	}

}
