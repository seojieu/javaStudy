package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		/*
		 	 키보드로 2개의 정수형 데이터를 입력 받아, 두 수가 모두 1부터 9까지의 수일 때만 
		 	 두 수의 곱이 한자리 수인지 두자리 수인지를 출력한다.
		 	 
		 	 실행 결과
		 	 입력 : 2 3
		 	 한자리 수 입니다.
		 	 
		 	 입력 : 4 5
		 	 두자리 수 입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num1 = sc.nextInt();
//		System.out.print(" ");
		int num2 = sc.nextInt();
		
		int result;
		if((1 <= num1 && num1 <= 9) && (1<= num2 && num2 <= 9)) {
//			result = num1 * num2;
//			if(1 <= result && result <= 9) {
//				System.out.println("한자리 수 입니다.");
//		} else if (10 <= result && result <= 99) {
//			System.out.println("두자리 수 입니다.");
		}
		System.out.println(((num1 * num2) >= 10) ? "두자리 수 입니다." : "한자리 수 입니다.");
		}
	}

}
