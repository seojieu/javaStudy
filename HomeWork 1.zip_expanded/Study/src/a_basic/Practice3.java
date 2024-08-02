package a_basic;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
	
		System.err.println("=======다시 해보기========");
		
	/*
	 * 영어 단어를 키보드로 입력받아 단어의 앞에서부터 3개를 출력하세요.
	 * ex) apple -> app
	 * 
	 * 단어를 입력하세요 : apple(키보드로 입력)
	 * 첫 번째 문자 : a
	 * 두 번째 문자 : p
	 * 세 번째 문자 : p
	 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요 : ");
		String str = sc.next();
		
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
		
	}
}