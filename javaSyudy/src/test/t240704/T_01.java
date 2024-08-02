package test.t240704;

import java.util.Scanner;

public class T_01 {

	public static void main(String[] args) {
		/*
		 * 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		 * 로그인 성공 시 "로그인 성공",
		 * 아이디가 틀렸을 시 " 아이디가 틀렸습니다.",
		 * 비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다."를 출력하세요.
		 * 
		 * ex 1.									ex 2.									ex3.
		 * 아이디 : myId				    아이디 : myId					아이디 : my
		 * 비밀번호 : myPassword12	비밀번호 : myPassword	비밀번호 : myPassword12
		 * 로그인 성공						비밀번호가 틀렸습니다.		아이디가 틀렸습니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		final String ID = "myId";
		final String PWD = "myPassword12";
		String id, pwd;
		
		System.out.print("아이디 : ");
		id = sc.next();
		
		System.out.print("비밀번호 : ");
		pwd = sc.next();
		
		//아이디 일치
		// -> 패스워드 일치
		
		if(ID.equals(id)) {
			if(PWD.equals(pwd)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
			} else  {
			System.out.println("아이디가 틀렸습니다.");
		}
		
	}

}
