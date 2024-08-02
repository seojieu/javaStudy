package study_240716.object2;

import java.util.Scanner;

public class PersonMenu {
	 Scanner sc = new Scanner(System.in);
	 PersonController pc = new PersonController();
	int num;
	
	public void mainMenu() {
		// 필드
		
		
		while(true) {
		int[] countArr = pc.personCount();
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은" + countArr[0] + "명입니다.");
		
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은" + countArr[1] + "명입니다.");
		
		// M과 N에 들어가는 숫자는 PersonController(pc)클래스에 있는
		// personCount()메소드의 반환 값을 이용하여 출력
		
		
		System.out.println("1. 학생 메뉴 ");//➔ studentMenu()
		System.out.println("2. 사원 메뉴");//➔ employeeMenu()
		System.out.println("9. 끝내기");// ➔ “종료합니다.” 출력 후 종료
		System.out.print("메뉴 번호 :");
		num = sc.nextInt();
		
		switch(num) {
		case 1 :
			this.studentMenu();
			break;
		case 2 :
			this.employeeMenu();
			break;
		case 9 :
			System.out.println("종료합니다");
			return;
		// 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
	
		}
	}
	
	public void studentMenu() {
		while(true) {
		System.out.println();
		System.out.println("1. 학생 추가");// ➔ insertStudent()
		System.out.println("2. 학생 보기");//➔ printStudent()
		System.out.println("9. 메인으로");//➔ “메인으로 돌아갑니다.” 출력 후 메인으로
		System.out.print("메뉴 번호 :");
		num = sc.nextInt();
		 
		 switch(num) {
		 case 1 : 
			 this.insertStudent();
			 break;
		 case 2 : 
			 this.printStudent();
			 break;
		 case 9 :
			 System.out.println("메인으로 돌아갑니다.");
			 this.mainMenu();
			 return;
			 default :
				 System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		 }
		}
		// 만일 학생 객체 배열에 담긴 데이터의 수가 3개 일 때
		// “학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상
		// 활성화 되지 않습니다.”를 출력 후 메뉴 번호를 담음
		// 실제로 1번을 누르면 “잘못 입력하셨습니다. 다시 입력해주세요.”를 출력
		// 학생 객체 배열에 담긴 데이터의 수가 3개가 아닐 때는
		// 위에 출력한 메뉴 모두 받을 수 있게 함
		
		// 잘못 입력했을 경우, “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
	}
	
	public void employeeMenu() {
		while(true) {
			System.out.println("1. 사원 추가");// ➔ insertEmployee()
			System.out.println("2. 사원 보기");// ➔ printEmployee()
			System.out.println("9. 메인으로");// 	➔ “메인으로 돌아갑니다.” 출력 후 메인으로
			System.out.println("메뉴 번호 :");
			num = sc.nextInt();
		
		
		switch(num) {
		case 1 : 
			this.insertEmployee();
			break;
		case 2 :
			this.printEmployee();
			break;
		case 9 :
			System.out.println("메인으로 돌아갑니다.");
			this.mainMenu();
			break;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
	}
		// 만일 사원 객체 배열에 담긴 데이터의 수가 10개 일 때
		// “사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상
		// 활성화 되지 않습니다.”를 출력 후 메뉴 번호를 담음
		// 실제로 1번을 누르면 “잘못 입력하셨습니다. 다시 입력해주세요.”를 출력
		// 사원 객체 배열에 담긴 데이터의 수가 10개가 아닐 때는
		// 위에 출력한 메뉴 모두 받을 수 있게 함
		
		// 잘못 입력했을 경우, “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
	}
	
	public void insertStudent() {
		while(true) {
		System.out.println("학생 이름 :");
		String name = sc.next();
		System.out.println("학생 나이 :");
		int age = sc.nextInt();
		System.out.println("학생 키 :");
		double height = sc.nextInt();
		System.out.println("학생 몸무게 :");
		double weight = sc.nextInt();
		System.out.println("학생 학년 :");
		int greade = sc.nextInt();
		System.out.println("학생 전공 :");
		String major = sc.next();
		
		if(pc.personCount()[0] == 3) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고"
					+ "학생 메뉴로 돌아갑니다.");
			return;
		}
		
		pc.insertStudent(name, age, height, weight, greade, major);
			System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : " );
			char ch = sc.next().charAt(0);
			if(ch == 'n' || ch == 'N') {
				return;
			}
			
	}
			
			// 위의 데이터를 모두 사용자에게 입력 받아 pc의 insertStudent()메소드의
			// 매개변수로 넘겨 줌
			// 이 때 학생 객체 배열에 담긴 데이터의 수가 3개가 되지 않았을 때는
			// “그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : “를 출력해
			// N 또는 n이 아니면 위의 데이터를 받는 것을 반복하고
			// N 또는 n이라면 반복을 멈춤
			// 만일 학생 객체 배열에 담긴 데이터의 수가 3이 되었을 때는
			// “학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고
			// 학생 메뉴로 돌아갑니다.”를 출력 후 반복 종료
	}
	
	public void printStudent() {
		// pc의 printStudent() 메소드의 반환 값을 이용하여 학생 객체 배열에 저장된
		// 모든 데이터 출력
		Student[] sArr = pc.printStudent();
		for(Student s : sArr) {
			if(s == null) {
				break;
			}
		}
		System.out.println(pc.printStudent());
	}
	
	public void insertEmployee() {
		System.out.println("사원 이름 :");
		String name = sc.next();
		System.out.println("사원 나이 :");	
		int age = sc.nextInt();
		System.out.println("사원 키 :");
		int height = sc.nextInt();
		System.out.println("사원 몸무게 :");
		int weight = sc.nextInt();
		System.out.println("사원 급여 :");
		int salary = sc.nextInt();
		System.out.println("사원 부서 :");
		String dept = sc.next();
		
		pc.insertEmployee(name, age, height, weight, salary, dept);
			// 위의 데이터를 모두 사용자에게 입력 받아 pc의 insertEmployee()메소드의
			// 매개변수로 넘겨 줌
			// 이 때 사원 객체 배열에 담긴 데이터의 수가 10개가 되지 않았을 때는
			// “그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : “를 출력해
			// N 또는 n이 아니면 위의 데이터를 받는 것을 반복하고
			// N 또는 n이라면 반복을 멈춤
			// 만일 사원 객체 배열에 담긴 데이터의 수가 10이 되었을 때는
			// “사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고
			// 사원 메뉴로 돌아갑니다.”를 출력 후 반복 종료
	}
	
	public void printEmployee() {
		// pc의 printEmployee() 메소드의 반환 값을 이용하여 사원 객체 배열에 저장된
		// 모든 데이터 출력
		System.out.println(pc.printEmployee());
	}
}
