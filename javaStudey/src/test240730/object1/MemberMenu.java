package test240730.object1;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		System.out.println("========== KH 사이트 ==========");
		while(true) {
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 회원가입"); // joinMembership() 실행
		System.out.println("2. 로그인"); // logIn() 실행 후 memberMenu() 실행
		System.out.println("3. 같은 이름 회원 찾기"); // sameName()
		System.out.println("9. 종료"); // “프로그램 종료.” 출력 후 main()으로 리턴
		System.out.print("메뉴 번호 선택 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			this.joinMembership();
			break;
		case 2:
			this.logIn();
			this.memberMenu();
			break;
		case 3:
			this.sameName();
			break;
		case 9:
			System.out.println("프로그램 종료.");
			return;
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
		}
		}
		// 메뉴 화면 반복 실행 처리
		// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
	}
	
	public void memberMenu() {
		while(true) {
		System.out.println("******* 회원 메뉴 *******");
		System.out.println("1. 비밀번호 바꾸기"); // changePassword() 실행
		System.out.println("2. 이름 바꾸기 ");// changeName()
		System.out.println("3. 로그아웃"); // “로그아웃 되었습니다.” 출력 후 mainMenu()로 리턴
		System.out.print("메뉴 번호 선택 : "); 
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			this.changePassword();
			break;
		case 2:
			this.changeName();
			break;
		case 3:
			System.out.println("로그아웃 되었습니다.");
			this.mainMenu();
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
		}
		}
		// 메뉴 화면 반복 실행 처리
		// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
	}
	
	public void joinMembership() {
		while(true) {
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		boolean res = mc.joinMembership(id, new Member(password,name));
		
		if(res) {
			System.out.println("성공적으로 회원가입 완료하였습니다.");
			break;
		} else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
		}
	}
	
	public void logIn() {
		while(true) {
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		String res = mc.logIn(id, password);
		if(res != null) {
			System.out.println(res+ "님, 환영합니다!");
			return;
		} else {
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
		}
		}
	}
	
	public void changePassword() {
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			
			System.out.print("현재 비밀번호 : ");
			String password = sc.next();
			
			System.out.print("새로운 비밀번호 : ");
			String repassword = sc.next();
			
			boolean res = mc.changePassword(id, password, repassword);
			if(res) {
				System.out.println("비밀번호 변경에 성공했습니다.");
			} else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			}
		
	}
	}
	
	public void changeName() {
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			
			System.out.print("비밀번호 : ");
			String password = sc.next();
			
			String res = mc.logIn(id, password);
			if(res != null) {
				System.out.print("현재 설정된 이름 : " + res);
				
				System.out.print("변경할 이름 : ");
				String changename = sc.next();
				
				mc.changeName(id, changename);
			} else {
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
			}
			
			
//		아이디와 비밀번호를 받아 mc의 logIn()으로 넘겨 현재 저장되어 있는 이름을 받고
//		사용자에게 현재 저장되어 있는 이름을 출력하여 보여줌.
//		변경할 이름을 받아 mc의 chageName()로 id와 함께 넘기고
//		“이름 변경에 성공하였습니다.” 출력
//		만일 logIn()로부터 저장되어 있는 이름을 받지 못 했다면
//		“이름 변경에 실패했습니다. 다시 입력해주세요” 출력 후 반복
	}
	}
	
	public void sameName() {
		
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		int num = sc.nextInt();
		TreeMap result = mc.sameName(name);
		if(result.isEmpty()) {
			System.out.println("회원을 찾지 못하였습니다.");
		} else {
			for(Object entry : result.entrySet()) {
				Entry<String,String> en = (Entry)entry;
				System.out.println(en.getKey() + " : " + en.getValue());
				int answer = 2030 - num;
			}
		}
	}
}

//		검색할 이름을 받고 mc의 sameName()메소드로 넘김.
//		반환 값을 가지고 entrySet()을 이용하여 ‘이름-아이디’ 형식으로 출력
