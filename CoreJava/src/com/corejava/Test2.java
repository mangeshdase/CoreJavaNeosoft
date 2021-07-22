package com.corejava;

 class Shape {
	public void area() {
		
	}
	public void draw() {
		
	}
}
	class Circle extends Shape{
		public void area(int r) {
			System.out.println("Ara of circle : "+3.14*r*r);
	}
		public void draw(int r) {
			System.out.println("Drawing a circle with radius :"+r);
		}
	}
	class Triangle extends Shape{
		public void area(int l, int h) {
			System.out.println("Area of Triangle:"+0.5*l*h);
		}
		void draw(int l, int h) {
			System.out.println("Drawing a triangle with heiht:"+h+"and base:"+l);
		}
	}
	class Square extends Shape{
		void area(int l) {
			System.out.println("Area of Square:"+l*l);
		}
		void draw(int l)
		{
			System.out.print("Drawing Square with length : "+l);
		}
	}
	class Test2{
	
			public static void main(String[] args) {
				Square s = new Square();
				s.area(5);
				Triangle t = new Triangle();
				t.area(5,4);
		}
		// TODO Auto-generated method stub

	}

