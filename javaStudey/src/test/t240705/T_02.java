package test.t240705;

import java.util.Scanner;

public class T_02 {

	public static void main(String[] args) {
		/*
		 	주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		 	ex.
		 	주민번호를 입력하세요(- 포함) : 132456-2123456
		 	
		 	여자
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String num = sc.next();
		
		if(num.charAt(7) == '2' || num.charAt(7) == '4' ) {
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
		
		/*char gender = str.charAt();
		switch(gender) {
		case '1' :
		case '3' :
		System.out.println("남자");
		case '2' :
		case '4' :
		System.out.println("여자");
		break;
		defalt:
		system.out.println("잘못 입력하셨습니다");
		 */
	}

}
