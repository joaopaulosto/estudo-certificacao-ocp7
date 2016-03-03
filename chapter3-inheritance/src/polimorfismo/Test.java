package polimorfismo;

abstract class Shape {
	public abstract Shape copy();
}

class Circle extends Shape {
	public Circle(int x, int y, int radius) {

	}

	@Override
	public Circle copy() {
		return null;
	}
}

public class Test {
	public static void main(String[] args) {
		Circle c1 = new Circle(10, 20, 30);
		Circle c2 = c1.copy();
	}

}
