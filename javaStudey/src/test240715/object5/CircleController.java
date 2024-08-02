package test240715.object5;

import test240715.object4.Circle;

public class CircleController {
	protected Circle c = new Circle();
	
	public String calcArea (int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double area = Math.PI * radius * radius;
		return c.toString()+ " / " + area;
	}
	
	public String calcCircum(int x,int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double circum = Math.PI * radius * 2;
		return c.toString() + " / " + circum;
	}
}
