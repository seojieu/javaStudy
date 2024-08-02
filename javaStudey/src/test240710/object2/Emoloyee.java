package test240710.object2;

public class Emoloyee {
	//필드
		private int empNo;
		private String empName;
		private String dept;
		private String job;
		private int age;
		private char gender;
		private int salary;
		private double bounsPoint;
		private String phone;
		private String address;
		
		//생성자
		public Emoloyee() {
			super();
	}

		public Emoloyee(int empNo, String empName) {
			super();
			this.empNo = empNo;
			this.empName = empName;
		}

		public Emoloyee(int empNo, String empName, String dept, String job, int age, char gender, int salary,
				double bounsPoint, String phone, String address) {
			super();
			this.empNo = empNo;
			this.empName = empName;
			this.dept = dept;
			this.job = job;
			this.age = age;
			this.gender = gender;
			this.salary = salary;
			this.bounsPoint = bounsPoint;
			this.phone = phone;
			this.address = address;
		}

		public int getEmpNo() {
			return empNo;
		}

		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

		public String getJob() {
			return job;
		}

		public void setJob(String job) {
			this.job = job;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public double getBounsPoint() {
			return bounsPoint;
		}

		public void setBounsPoint(double bounsPoint) {
			this.bounsPoint = bounsPoint;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
}


