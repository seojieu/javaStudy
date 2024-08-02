package test240715.object1;

public class Student {
	//학생성적관리 프로그램을 만들고자한다.
			//학생 클래스를 정의해보자. Student class는 name(String),classRoom(int),
			//javaScore(double), sqlScore(double),practiceScore(double)값을 가진다.
			//각 필드데이터의 getter/setter, 기본생성자, 모든 필드데이터를 초기화하는 생성자를 작성하고
			//또한 toString : 학생의 정보를 "xx반 xxx학생 xx점 xx점 xx점"으로 정보를 반환하는 메소드 각 전수는 자바, sql, practice순으로 작성
			//		isPassed : 모든 점수가 60점 이상이면서 평균이 60점이상이면 true 아니면 false를 반환하는 메소드
			//		reTest : 학생의 모든 점수를 랜덤 (0 ~ 100)으로 다시부여하는 메소드 반환없음
			
	private String name;
	private int classRoom;
	private double javaScore;
	private double sqlScore;
	private double practiceScore;
	
	public Student () {}

	public Student(String name, int classRoom, double javaScore, double sqlScore, double practiceScore) {
		super();
		this.name = name;
		this.classRoom = classRoom;
		this.javaScore = javaScore;
		this.sqlScore = sqlScore;
		this.practiceScore = practiceScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public double getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(double javaScore) {
		this.javaScore = javaScore;
	}

	public double getSqlScore() {
		return sqlScore;
	}

	public void setSqlScore(double sqlScore) {
		this.sqlScore = sqlScore;
	}

	public double getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(double practiceScore) {
		this.practiceScore = practiceScore;
	}
	
	public String toString() {
		return this.classRoom + "반 " + this.name + "학생 " + this.javaScore + "점 " + this.sqlScore + "점" + this.practiceScore + "점";
	}
	
	//		isPassed : 모든 점수가 60점 이상이면서 평균이 60점이상이면 true 아니면 false를 반환하는 메소드
	//		reTest : 학생의 모든 점수를 랜덤 (0 ~ 100)으로 다시부여하는 메소드 반환없음
	public boolean isPassed() {
		double avg= 0; 
		double sum = 0;
		
		
		sum = (this.javaScore + this.sqlScore + this.practiceScore);
		avg = sum / 3;
		if(this.javaScore >= 60 && this.sqlScore >=60 && this.practiceScore >= 60 && avg >= 60) {
			return true;
		} else { 
			return false;
		}
		
	}
	
	public void reTest() {
		this.javaScore = (Math.random() * 101);
		this.sqlScore = (Math.random() * 101) ;
		this.practiceScore = (Math.random() * 101);
	}
	
}

