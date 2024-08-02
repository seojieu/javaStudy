package k.exception;

import java.io.IOException;

import k.exception.ex2.CharCheckException;

public class Run {
	/*
	 * 에러종류
	 * 1.논리 에러 : 문법적으로도 문제없고 실행했을 때도 문제는 없지만 프로그램의 의도와 맞지않은 동작이나 결과가 나타나는 에러
	 * 2.컴파일 에러 : 소스코드 문법상의 에러 -> 빨간줄로 에초에 오류를 알려준다. (개발자의 실수) -> 발견과 해결이 쉽다.
3.런타임 에러 : 코드상의 문제가 없지만 프로그램 실행도중 발생하는 에러(사용자의 실수 또는 개발자가 미처 처리하지 않은 기능)
4.시스템 에러
컴퓨터 오작동으로 발생하는 에러, 소스 코드로 해결이 안됨 -> 심각

컴파일에러, 런타임에러, 논리에러 같은 개발자가 예측가능하며 수정할 수 있는 에러들을 가지고 작업
	 * 
	 * 
	 * 사용한 리소스 반납방법 2가지
	 * 1. finally에서 반납
	 * 2. try-with-resource
	 * 
	 */

	public static void main(String[] args) {
		RunException ex = new RunException();
//		ex.method01();
//		ex.method02();
		
//		Scanner sc = new Scanner(System.in);
//		try {
//		int length = cc.countAlpha(str);
//	 System.out.println("\'"+  str+ "\'에 포함된 영문자 개수 : " + length);
//			} catch (CharCheckException e) {
//				System.out.println("문자열에 공백이 포함되어있습니다.");
//				e.printStackTrace();
//			}finally {	//예외가 발생하건 안하건 try-catch종료후 마지막에 실행하는 코드
//				sc.close();
//				System.out.println("잘 종료되었습니다.");
//			}          
		
		
		
		ex.myInfo(null);
}
}