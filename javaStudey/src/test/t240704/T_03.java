package test.t240704;

import java.util.Scanner;

public class T_03 {

	public static void main(String[] args) {
		/*
		 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요.
		 
		 ex.
		 첫 번째 숫자 : 8	첫 번째 숫자 : 4		첫 번째 숫자 : 9
		 두 번째 숫자 : 4	두 번째 숫자 : 8		두 번째 숫자 : 4
		 4 5 6 7 8				4 5 6 7 8				1 이상의 숫자를 입력하세요.
		 */
		
		//두 수를 입력
		//작은수와 큰수 구분하기
		//작은수부터 큰수까지 출력
		Scanner sc = new Scanner(System.in);
		
		int max, min;
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		//둘중 더 큰수 구하기
		max = (num1 > num2)  ? num1 : num2;
		min = (num1 > num2) ? num2 : num1;
		
		if (min <1 || max < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}
				
			}
		}
}
		
		
//		for(int i = num2; i < num1; i++) {
//			for(int j = num1; i< num2; j++)
//			System.out.print(i);
//			if(num1 < 1) {
//				System.out.println("1 이상의 숫자를 입력해주세요");
//			}
//		}
