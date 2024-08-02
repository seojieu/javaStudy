package com.calc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		/*
		 	문제4
		 	main의 argument로 1자리 정수형(1부터 9까지만) 값을 2개 입력받아 4칙연산 결과를 출력한다.
		 	입력값은 모두 int 형으로 처리한다.
		 	
		 	설명
		 	두 정수의 합, 차, 곱, 나누기한 몫을 출력한다.
		 	단, 나누는 수(분모)가 0이거나, 0보다 작으면 결과는 0 처리한다.
		 	
		 	실행 결과
		 	4와 2를 입력하였을 경우
		 	합 : 2
		 	차 : 2
		 	곱 : 8
		 	나누기 : 2
		 	모든 결과는 int형으로 처리한다.
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수1 : ");
//		int num1 = sc.nextInt();
//
//		System.out.print
//		("정수2 : ");
//		int num2 = sc.nextInt();
//		
//			if ((1 <= num1 && num1 <= 9) && (1 <= num2 && num2 <= 9) ) {
//			
//				System.out.println( " 합 : " + (num1 + num2));
//				System.out.println( " 차 : " + (num1 - num2));
//				System.out.println( " 곱 : " + (num1 * num2));
//				System.out.println( "나누기 : " + (num1 / num2));
//			} else if(num2 <=0) { 
//				System.out.println( " 합 : " + (num1 + num2));
//				System.out.println( " 차 : " + (num1 - num2));
//				System.out.println( " 곱 : " + (num1 * num2));
//				System.out.println("나누기 : " + "0");
		}  
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[2];
	arr[0] = sc.nextInt();
	
	arr[1] = sc.nextInt();
	
	System.out.println("합 : " + (arr[0] + arr[1]));
	System.out.println("차 : " + (arr[0] - arr[1]));
	System.out.println("곱 : " + (arr[0] * arr[1]));
	System.out.println("나누기 : "  + (arr[0] / arr[1]));
}
}
