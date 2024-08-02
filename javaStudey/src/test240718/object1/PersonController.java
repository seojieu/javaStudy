package test240718.object1;

public class PersonController {
	Person[] p = new Person[20];
//	Student[] s = new Student[3];// s,s,n
//	Employee[] e = new Employee[10];//e,e,e,n,n,n,n,n,n,n
	
	//학생객체 수를 int[0]에
	//근로자객체 수를 countArr[1]에 넣어서 반환
	public int[] personCount() {
		int[] countArr = new int[2];
		
		int studentCount = 0, employeeCount = 0;
		for(Person tmp : p) {
			if(tmp == null) {
				break;
			}	else if(tmp instanceof Student) {
				studentCount++;
			}	else if(tmp instanceof Employee) {
			employeeCount++;
		}

		countArr[0] = studentCount;
		countArr[1] = employeeCount;
		
		return countArr;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade,String major) {
		for(int i=0; i<s.length; i++) {
			if(s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				return;
			}
		}
	}
	
	public Student[] printStudent() {
		return this.s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i = 0; i <e.length; i++) {
			if()
		}
	}
	
	public Student[] printEmployee() {
		return null;
	}	
	
	public void insertPerson(Person p) {
		
	}
	
	public Person[] printPerson() {
		return null;
	}
}

