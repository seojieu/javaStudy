package test240715.object4;

public class Circle extends Point {
	protected int radius;
	
	public Circle() { }

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String toString() { 
		return super.toString() + "," + this.radius;
	}
	
	
}
