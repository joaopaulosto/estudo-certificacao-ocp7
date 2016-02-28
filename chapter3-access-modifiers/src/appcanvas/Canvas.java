package appcanvas;

import graphicshape.Circle;

public class Canvas {
	void getArea() {
		Circle c = new Circle();
		c.area(); // call to public method area(), outside package
	}
}
