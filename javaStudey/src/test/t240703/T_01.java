package test.t240703;

import java.util.Scanner;

public class T_01 {

	public static void main(String[] args) {
		//아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 "oo메뉴입니다"를,
		// 종료 번호를 누르면 "프로그램이 종료됩니다."를 출력하세요.
		
		//ex) 1.입력
		// 	 2.수정
		//		 3.조회
		//		 4.삭제
		//		 7.종료
		//메뉴 번호를 입력하세요 : x
		//조회 메뉴입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 : ");
		int manu = sc.nextInt();
		
		switch (manu ) {
		case 1:
			System.out.println( manu + ". 입력메뉴입니다");
			break;
		case  2:
			System.out.println( manu + ". 수정메뉴 입니다");
			break;
		case 3:
			System.out.println( manu + ". 조회메뉴 입니다");
			break;
		case 4:
			System.out.println( manu + ". 삭제메뉴 입니다");
			break;
		case 7:
			System.out.println( manu + ". 종료");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			}
	}

}
