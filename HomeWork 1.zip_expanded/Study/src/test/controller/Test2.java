package test.controller;

public class Test2 {

	public static void main(String[] args) {
		/*
		 	문제 2
		 	2단에서 5단까지의 구구단의 결과 중 홀수인 것만 출력한다. 단, for문을 이용한다.
		 	
		 	실행 결과
		 	3 * 1 = 3
		 	3 * 3 = 9
		 	3 * 5 = 15
		 	. . .
		 	5 * 5 = 25
		 	5 * 7 = 35
		 	5 * 9 = 45
		 */
		
		for(int i = 2; i <= 5; i++) {
			for(int j = 1; j<=9; j++) {
				if(i % 2 != 0 && j % 2 !=0) {
					System.out.println(i + "*" + j + " = " + (i * j));
				}
			}
		}
	}

}
