package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*
		 	문제 1
		 	키보드로 1개의 정수형(int) 데이터를 입력 받아, 1~100 사이의 값일 때만 2의 배수인지 아닌지를 출력처리한다.
		 	
		 	1.package명=					클래스명 		메소드											설명
		 	test.controller				Test1			+main(args:String []):void main		함수 안에서 모든 코드 작업 진행
		 	
		 	진행결과
		 	입력 : 3
		 	2의 배수가 아닙니다.
		 	입력 : 80
		 	2의 배수입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		if(1 <= num && num <=100) {
			if(num % 2 == 0) {
				System.out.println("2의 배수입니다.");
				break;
			} else {
				System.out.println("2의 배수가 아닙니다.");
			}
//			System.out.println(num % 2 == 0 ? "2의 배수입니다." : "2의 배수가 아닙니다.");
			}
		}
	}

}
