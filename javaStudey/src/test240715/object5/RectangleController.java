package test240715.object5;

import test240715.object4.Rectangle;

public class RectangleController {
	protected Rectangle r = new Rectangle();
	
	public String calcArea(int x,int y, int hight,int width) {
		r.setWidth(width);
		r.setHeight(hight);
		double area = width * hight;
		return r.toString() + " / " + area;
	}
	
	public String calcPerimeter(int x, int y, int hight, int width) {
		r.setWidth(width);
		r.setHeight(hight);
		double perimeter = 2 * (width + hight);
		return r.toString() + " / " + perimeter;
	}
}
