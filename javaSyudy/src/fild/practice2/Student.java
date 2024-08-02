package fild.practice2;

public class Student {
	//필드
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	//생성자
	public Student () { }
	
	public Student(int grade, int classroom, String name, double height,char gender) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
	
	//메소드
	//setter()/getter()
	//information()
	public void information() {
		System.out.print("학년 : " + this.grade + " \n반 : " + this.classroom + "\n이름 : " + this.name + "\n키 : " + this.height + "\n성별 : " + this.gender);
	}
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
