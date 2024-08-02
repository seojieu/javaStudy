package a.basic;
import java.util.Scanner;
public class Practice2 {
	/*
	 * 키보드로 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하세요
	 * 면적 : 가로 * 세로
	 * 둘레 : (가로 + 세로)  * 2
	 * 
	 * 가로 : (키보드로 입력)
	 * 세로 : (키보드로 입력)
	 * 
	 * 면적 : ~
	 * 둘레 : ~
	 * + 소수점 2번째 자리까지만 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float num1,num2;
    	//	System.out.print("가로 : ");
		System.out.println("가로와 세로 : ");
		num1 = sc.nextFloat();
		//sc.nextLine();
		
		System.out.print("세로 : ");
		num2 = sc.nextFloat();
		sc.nextLine();
		
		System.out.printf("면적 : %.2f\n", ( num1 * num2));
		System.out.printf("둘레 : %.2f", (num1 + num2) * 2);
	}

}
