package question5;

public class Color {

	int red, green, blue;

	Color(int r, int g, int b) {
		red = r;
		green = g;
		blue = b;
	}

	Color() {
		this(10, 10, 10);
	}

	public String toString() {
		return "This color is: " + red + green + blue;
	}

	public static void main(String[] args) {
		System.out.println(new Color());
	}
	
}
