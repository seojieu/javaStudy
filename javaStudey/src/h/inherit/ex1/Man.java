package h.inherit.ex1;

public class Man {
	private String name;
	
	private Man() {
		super ();
	}
	
	public Man(String name) {
		super();
		this.name = name;
	}
	
	
	public void tellYourName() {
		System.out.println("My name is " + this.name);
	}
}
