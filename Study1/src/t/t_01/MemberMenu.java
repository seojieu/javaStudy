package t.t_01;

import java.util.Scanner;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	
	private MemberController mc = new MemberController();
	
	public MemberMenu() { }
	
	public void mainMenu() {
		System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE + "명입니다.");
		System.out.println("현재 등록된 회원 수는" + mc.existMemberNum()  + "명입니다.");
		// MemberController(mc)클래스 안에 있는 멤버필드를 이용하여
		// 최대 등록 가능한 회원 수가 몇 명인지 출력
		// 또한 현재 등록된 회원 수는 mc에 existMemberNum()의 반환 값으로
		// 몇 명이 등록되어 있는지 출력
		// 현재 등록된 회원 수에 따라 메인 메뉴를 다르게 출력
		// 현재 등록된 회원 수가 10명이 아닐 때
		while(mc.existMemberNum() <= 10) {
		System.out.println("1. 새 회원 등록 "); //➔ insertMember()
		System.out.println("2. 회원 검색 "); // ➔ searchMember()
		System.out.println("3. 회원 정보 수정 "); // ➔ updateMemner()
		System.out.println("4. 회원 삭제 "); //➔ deleteMember()
		System.out.println("5. 모두 출력 "); //➔ printAll()
		System.out.println("9. 끝내기 "); 
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			this.insertMember();
			break;
		case 2:
			this.searchMember();
			break;
		case 3:
			this.updateMember();
			break;
		case 4:
			this.deleteMember();
			break;
		case 5:
			this.printAll();
			break;
		case 9:
			System.out.println("프로그램을 종료합니다");
			return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		}
		while(mc.existMemberNum() >= 10) {
			System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
		// 현재 등록된 회원 수가 10명일 때
			System.out.println("2. 회원 검색 "); // ➔ searchMember()
			System.out.println("3. 회원 정보 수정 "); // ➔ updateMemner()
			System.out.println("4. 회원 삭제"); // ➔ deleteMember()
			System.out.println("5. 모두 출력"); // ➔ printAll()
			System.out.println("9. 끝내기"); 
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 2:
				this.searchMember();
				break;
			case 3:
				this.updateMember();
				break;
			case 4:
				this.deleteMember();
				break;
			case 5:
				this.printAll();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return;
				default :
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	
		// 두 경우 모두 끝내기를 누르면 “프로그램을 종료합니다” 출력 후
		// 프로그램 종료하고 메뉴 번호에 없는 번호를 누를 시
		// “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 메뉴 반복
		

	}
	
	public void insertMember() {
		// 회원 등록에 필요한 아이디, 이름, 비밀번호, 이메일, 성별, 나이를
		// 사용자에게 직접 입력 받되 아이디의 경우 기존 회원의 아이디와
		String id,password,name,email;
		char gender;
		int age;
		
		System.out.println("새 회원을 등록합니다.");
		
		while(true) {
			System.out.println("아이디 : ");
			id = sc.next();
			if(mc.checkId(id)) {
				break;
		} else {
			System.out.println("중복된 아이디입니다.");
		}
		
		
		System.out.println("이름 : ");
		name = sc.next();
		
		System.out.println("비밀번호 : ");
		password = sc.next();
		
		System.out.println("이메일 : ");
		email = sc.next();
		
		while(true) {
		System.out.println("성별 : ");
		 gender = sc.next().charAt(0);
		if((gender == 'f' || gender == 'F') || (gender == 'm' || gender == 'M')) {
			break;
		} else {
			System.out.println("성별을 다시 입력하세요.");
		}
		}
		System.out.println("나이 : ");
		age = sc.nextInt();
		
		mc.insertMember(id, name, password, email, email, age);
		} 
		// 중복되지 않도록 mc의 checkId()메소드를 통해서 중복 검사를 함
		// 중복 검사를 한 결과 값에 따라 중복 값이 없으면 다음으로 넘어가고
		// 있으면 “중복된 아이디입니다. 다시 입력해주세요.”라는 문구를 출력 후
		// 다시 아이디를 받도록 함
		// 성별의 경우 M이나 m, F나 f가 아니면 “성별을 다시 입력하세요.”를
		// 출력 후 다시 성별을 입력하도록 함
		// 아이디부터 나이까지 모든 데이터를 받았으면
		// mc의 insertMember메소드의 매개변수로 넘김
	}
	
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아기기");
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1:
			this.searchId();
			break;
		case 2:
			this.searchName();
			break;
		case 3:
			this.searchEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String id = sc.next();
		
		mc.searchId(id);
		if(mc.searchId(id) == null ) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			
		}
		// 검색할 아이디를 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 searchId() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
		// 회원 검색 결과 출력

	}
	
	public void searchName() {
		
	}
	
	public void searchEmail() {
		
	}
	
	public void updateMember() {
		
	}
	
	public void updatePassword() {
		
	}
	
	public void updateName() {
		
	}
	
	public void updateEmail() {
		
	}
	
	public void deleteMember() {
		
	}
	
	public void deleteOne() {
		
	}
	
	public void deleteAll() {
		
	}
	
	public void printAll() {
		
	}
}
