package f.object.ex5;

//이름 나이 수학점수 영어점수 국어점수를 데이터로 가지고 있는 개체를 만들어라
//데이터는 적접 접근을 허용하지 않고 모두 간접적으로 set/get을 해줄 수 있도록 작성해라
//모든 데이터를 매개변수로 받아 초기화하면서 객체를 생성할 수 있는 생성자를 작성

public class Student {

	// 필드영역(데이터)
	private String name;
	private int age;
	private int mathscore;
	private int engscore;
	private int korscore;

	// 생성자영역/ alt +shift + s -> o
	public Student() {
	}

	public Student(String name, int age, int mathscore, int engscore, int korscore) {
		this.name = name;
		this.age = age;
		this.mathscore = mathscore;
		this.engscore = engscore;
		this.korscore = korscore;
	}

	// 메소드영역(기능)
	// getter, setter -> alt + shift + s -> s

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 1) {
			this.age = 1;
			return; // 메소드 종료
		}
		this.age = age;
	}

	public int getMathscore() {
		return mathscore;
	}

	public void setMathscore(int mathscore) {
		if (mathscore < 1) {
			this.mathscore = 1;
			return; // 메소드 종료
		}
		this.mathscore = mathscore;
	}

	public int getEngscore() {
		return engscore;
	}

	public void setEngscore(int engscore) {
		if (engscore < 1) {
			this.engscore = 1;
			return; // 메소드 종료
		}
		this.engscore = engscore;
	}

	public int getKorscore() {
		return korscore;
	}

	public void setKorscore(int korscore) {
		if (korscore < 1) {
			this.korscore = 1;
			return; // 메소드 종료
		}
		this.korscore = korscore;
	}

	public double getEvg() {
		double evg = (this.korscore + this.mathscore + this.engscore) / 3.0;
		return evg;
	}

	public void printEvg() {
		System.out.println(this.getName() + "님의 평균 : " + this.getEvg());
	}

}