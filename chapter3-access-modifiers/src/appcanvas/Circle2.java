package appcanvas;

import graphicshape.Shape;

public class Circle2 extends Shape {
	// Defaul access not accesible outside the package
	/*
	 * String getName(){ return name; }
	 */

	// Protected access is accesible outside the package
	int getColor() {
		return color;
	}
}
