package b.operator;

import java.util.Scanner;

public class Operator1 {

	public static void main(String[] args) {
		//두수를 입력받아 어떤 숫자가 더 큰지를 출력하는 프로그램
		// 첫번째 정수 : 
		// 두번째 정수 :
		// 첫번째가 두번째보다 큽니다 : (true / false)
		// 첫번째 정수는 짝수입니다 : (true / false)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 정수 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("두번째 정수 : ");
//		int num2 = sc.nextInt();
		
//		int result = (num1 > num2) ? true : false;
//		System.out.println(result);
		
//	if(num1 > num2 ? true : false) {
//			System.out.println("첫번째가 두번째보다 큽니다 : " + true);
//		} else {
//			System.out.println("첫번째가 두번째보다 큽니다 : " + false);
//		}
		
//		boolean n = num1>num2 ? true : false;
//		System.out.println("첫번째가 두번째보다 큽니다 : " + n);
		
		//입력받은 정수값이 양수인지 아닌지 판별 후 출력해라
		//정수값 입력 : 
		// 양수/음수
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("정수값 입력: ");
		int num = sc.nextInt();
		
		
		if(num > 0) { 
			System.out.println("양수");
			break;
		} else {
			System.out.println("음수");
			System.out.println("다시 입력해주세요.");
		}
		}
	}
}
