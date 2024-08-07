package com.kh.view;

import java.util.Scanner;

import com.kh.controller.MemberController;
import com.kh.vo.Member;

// View : 사용자가 보게될 시각적인 요소(화면) 출력 및 입력
public class MainMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	/**
	 * 메인화면 : 가장 처음나타나는 화면으로 다양한 메뉴로 진입할 수있다.
	 */
	public void menu() {
		
		while(true) {
		System.out.println("====================도서관리프로그램=====================");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 아이디찾기 ");
		System.out.println("4. 비밀번호찾기");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 입력: ");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1:
			loginMember();
			break;
		case 2:
			//회원가입 화면
			insertMember();
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 9:
			System.out.println("프로그램을 종료합니다.");
			return;
		default:
			System.out.println("잘못입력하였습니다. 다시 입력해주세요");
		}
	}
}

	/**
	 * 회원가입 화면 : 사용자에게 회원가입에 필요한 정보를 입력받아 controller로 전달
	 */
	public void insertMember() {

		System.out.println("=====================회원가입=========================");
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 입력 : ");
		String pwd = sc.nextLine();

		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		//회원추가
		Member m = new Member(id, pwd, name, age);
		if(mc.insertMember(m)) {
			System.out.println("회원가입에 성공하였습니다.");
		} else {
			System.out.println("회원가입에 실패하였습니다.");
		}
	}

/**
 * 로그인 화면 : 사용자에게 id, pwd받아서 controller로 전달하여 로그인처리
 */
	public void loginMember() {
		System.out.println("===================== 로그인 =========================");
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 입력 : ");
		String pwd = sc.nextLine();
		
		//로그인 체크
		Member loginMember = mc.loginMember(id, pwd);
		if(loginMember == null) {
			System.out.println("로그인에 실패하였습니다. id, pwd를 다시 확인하세요.");
		} else {
			System.out.println("로그인에 성공하였습니다.");
		}
	}
}