package graphicshape;

public class Circle extends Shape {
	private int radius; // private field

	public void area() {
		// code for area method elided
		// access private field radius inside the class
		System.out.println("area:" + 3.14 * radius * radius);
	}
	void fillColor(){
		System.out.println("Color: " + color); //acess to preteced field, in subclass
	}
	String getName(){
		return name;
	}
}
