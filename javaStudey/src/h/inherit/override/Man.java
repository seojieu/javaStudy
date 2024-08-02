package h.inherit.override;

public class Man {
	private String name;
	
	private Man() {
		super ();
	}
	
	public Man(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "이름 : " + name ;
	}

	public void tellYourName() {
		System.out.println("My name is " + this.name);
	}
}
