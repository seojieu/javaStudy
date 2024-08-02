package test240716.object2;

public class Student extends Human{
	protected String namber;
	protected String major;
	
	public Student() { }

	public Student(String name, int age, int height, int weight, String namber, String major) {
		super(name, age, height, weight);
		this.namber = namber;
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString() +"  "+ namber +" "+ major;
	}

}
