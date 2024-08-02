package o.collection.list;

public class Student {
	private String name;
	private int age;
	private int score;
	
	public Student() {
		super();
	}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

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
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int hashCode() {	// 모든 필드에 담긴 값이 일치하면 동일한 hashCode반환
//		return super.hashCode(name,age,score);	//방법 1 Object이용
		return ("" +name + age + score).hashCode();	//방법 2 String의 hashCode를 이용
	}

	@Override
	public String toString() {
		return "Student [name =" + name + ", age = " + age + ", score = " + score + " ]";
	}

	//Student.equals(Student객체)
	@Override
	public boolean equals(Object obj) {	// 현재객체와 전달받은 객체의 각 필드값들이 모두 일치한다면 true/ 하나라도 일치하지 않는다면 false반환
		//this(현재객체) <-> obj(전달받은객체)
		
		if(obj instanceof Student) {
			Student other = (Student)obj;
			if(this.name.equals(other.getName()) &&
					this.age == other.getAge() &&
					this.score == other.getScore()) {
				return true;
			} else {
				return false;
			}
		}
		return super.equals(obj);
	}
	
	
}
