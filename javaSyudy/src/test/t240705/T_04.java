package test.t240705;

import java.util.Scanner;

public class T_04 {

	public static void main(String[] args) {
		/*
		 	A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
		 	인센티브 포함 급여가 3000만원 이상이면 "3000만원 이상", 미만이면 "3000 미만"을 출력하세요.
		 	(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
		 	
		 	ex.
		 	A사원의 연봉 : 2500
		 	B사원의 연봉 : 2900
		 	C사원의 연봉 : 2600
		 	
		 	A사원의 연봉/연봉+a : 2500/3500.0
		 	3000 이상
		 	B사원의 연봉/연봉+a : 2900/2900.0
		 	3000 미만
		 	C사원의 연봉/연봉+a : 2600/2989.999999995
		 	3000 미만
		 */
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("A사원의 연봉 : ");
		int num1 = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int num2 = sc.nextInt();
	 
		System.out.print("C사원의 연봉 : ");
		int num3 = sc.nextInt();
		
		double totalnum1, totalnum2, totalnum3;
		totalnum1 = num1 * 1.4;
		totalnum2 = num2;
		totalnum3 = num3+(num3 * 0.15);
		
		System.out.printf("A사원의 연봉/연봉+a : %d/%f\n", num1, totalnum1);
		System.out.println(totalnum1 > 3000 ? "3000 이상" : "3000 미만");
		
		System.out.printf("B사원의 연봉/연봉+a : %d/%f\n", num2, totalnum2);
		System.out.println(totalnum2 > 3000 ? "3000 이상" : "3000 미만");
		
		System.out.printf("C사원의 연봉/연봉+a : %d/%f\n", num3, totalnum3);
		System.out.println(totalnum3 > 3000 ? "3000 이상" : "3000 미만");
		
	}

}
