package a_basic;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		/*
		 * 키보드로 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하세요
		 * 면적 : 가로 * 세로
		 * 둘레 : (가로 + 세로) * 2
		 * 
		 * 가로 : (키보드로 입력)
		 * 세로 : (키보드로 입력)
		 * 
		 * 면적 : ~
		 * 둘레 : ~
		 * + 소수점 2번째 자리까지만 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");										//========== 오답노트 ===========
		double n1 = sc.nextDouble();
		
		System.out.print("세로 : ");										//	소수점 2번째 자리까지 출력하기 위해
		double n2 = sc.nextDouble();										//	Int자료형을 Double형으로 바꿔줘야한다.
		
		System.out.printf("면적 : %.2f\n", (n1 * n2));				//%.2f
		System.out.printf("둘레 : %.2f" , (n1 + n2) * 2);
	}

}
