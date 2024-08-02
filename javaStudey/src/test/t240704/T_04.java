package test.t240704;

import java.util.Scanner;

public class T_04 {

	public static void main(String[] args) {
		/*
		  사용자로부터 입력 받은 숫자의 단을 출력하세요.
		  
		  ex.
		  숫자 : 4
		  ===== 4단 =====
		  4	*	1	=	4
		  4	*	2	=	8
		  4	*	3	=	12
		  4	*	4	=	16
		  4	*	5	=	20
		  4	*	6	=	24
		  4	*	7	=	28
		  4	*	8	=	32
		  4	*	9	=	36
		 */

		/*
		  숫자 : 4
		  ===== 4단 =====
		  ===== 5단 =====
		  ===== 6단 =====
		  ===== 7단 =====
		  ===== 8단 =====
		  ===== 9단 =====
		  (해당 단의 내용들은 길이 상 생략)
		 */
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자 : ");
//		int dan = sc.nextInt();
//		
//		System.out.println("===== 4단 =====");
//		for(int i = 1; i <=9; i++) {
//				System.out.println(dan + " * " + i + " = " + (dan * i));
//			}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		for (int j = dan; j <= 9; j++) {

			System.out.println("=====" + j +"단" + "=====");
			for (int i = 1; i <= 9; i++) {
				System.out.println(j + " * " + i + " = " + (j * i));
			}
		}
	}
}


