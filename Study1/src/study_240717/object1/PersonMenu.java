package study_240717.object1;

import java.util.Scanner;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		while(true) {
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은" + pc.personCount() + "명입니다.");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은"+pc.personCount()+"명입니다.");
		
		// M과 N에 들어가는 숫자는 PersonController(pc)클래스에 있는
		// personCount()메소드의 반환 값을 이용하여 출력
		System.out.println("1. 학생 메뉴"); //	 ➔ studentMenu()
		System.out.println("2. 사원 메뉴"); // ➔ employeeMenu()
		System.out.println("9. 끝내기"); //		 ➔ “종료합니다.” 출력 후 종료
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			this.studentMenu();
			break;
		case 2:
			this.employeeMenu();
			break;
		case 9:
			System.out.println("종료합니다.");
			return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		}
		// 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
	}
	
	public void studentMenu() {
		if(pc.personCount() > 3) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
		}
		while (true) {
		System.out.println("1. 학생 추가 ");	//		➔ insertStudent()
		System.out.println("2. 학생 보기 ");	//	➔ printStudent()
		System.out.println("9. 메인으로 ");	//➔ “메인으로 돌아갑니다.” 출력 후 메인으로
		System.out.println("메뉴 번호 : ");	
		int num = sc.nextInt();

		switch(num) {
		case 1:
			this.insertStudent();
			break;
		case 2:
			this.printStudent();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
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
		
	}
	
	public void insertStudent() {
		
	}
	
	public void printStudent() {
		
	}
	
	public void insertEmployee() {
		
	}
	
	public void printEmployee() {
		
	}
}
