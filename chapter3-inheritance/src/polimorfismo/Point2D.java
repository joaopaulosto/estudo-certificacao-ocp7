package polimorfismo;

public class Point2D {
	private int xPos, yPOs;
	public Point2D(int x, int y) {
		xPos = x;
		yPOs = y;
	}
	@Override
	public String toString() {
		return "x = " + xPos + ", y = " + yPOs;
	}
	public static void main(String[] args) {
		System.out.println(new Point2D(10, 20));
	}

}
