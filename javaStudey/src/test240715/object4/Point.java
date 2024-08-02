package test240715.object4;

public class Point {
	//필드
	protected int x;
	protected int y;
	
	public Point() { }

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return this.x + ", " + this.y;
	}
}
