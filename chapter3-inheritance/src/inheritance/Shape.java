package inheritance;

import static java.lang.Math.PI;

public class Shape {
	public double area() {
		return 0;
	}

	public static void main(String[] args) {
		Shape shape1 = new Circle(10);
		System.out.println(shape1.area());
		Shape shape2 = new Square(10);
		System.out.println(shape2.area());
	}
}

class Circle extends Shape {
	private int radius;

	public Circle(int r) {
		radius = r;
	}

	@Override
	public double area() {
		//Without import static
		//return (Math.PI * radius * radius);
		//With import static
		return (PI * radius * radius);
	}
}

class Square extends Shape {
	private int side;

	public Square(int a) {
		side = a;
	}

	@Override
	public double area() {
		return (side * side);
	}
}

class TestShape {

}