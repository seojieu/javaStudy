package test240715.object1;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		//정수 num1 num2, num3를 입력받아 홀짝을 출력하라
		//입력: 6	4	7
		//짝 짝 홀
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1 % 2 == 0) {
		System.out.print("짝");
		}	else {
			System.out.print("홀");
		}
		if (num2 % 2 == 0) {
			System.out.print(" 짝");
		}	else {
			System.out.print(" 홀");
		}
		if (num3 % 2 == 0) {
			System.out.println(" 짝");
		} else {
			System.out.println(" 홀");
		}
		*/
		
		//정수(0~100)을 입력받아 0부터 입력받은 수까지 출력
		//입력 : 7
		//0	1	2	3	4	5	6	7
		/*
//		int num4 = (int)(Math.random() *101) +1;
		System.out.println("정수(0~100)을 입력받아 0부터 입력받은 수까지 출력");
		System.out.print("입력 : ");
		int num4 = sc.nextInt();
		
		if ( 0<=num4 && num4<=100) {
		for(int i = 0; i <= num4; i++) {
			System.out.print(i + " ");
		}
		
	}
		*/
	
		/*
		int[] arr = new int[20]; //0 0	0	0	0	0	0	0	0	0	0	0	0	0	0	0 0 0 0	0
		
		System.out.print("입력 : ");
		for(int i = 1; i <= 10; i ++) {
		int num = (int)(Math.random() * 20) +1;
		System.out.print(num+ " ");
		
		arr[i] = num;
		arr[num -1]++;
		}
		System.out.println();
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
		 */
	
		//학생성적관리 프로그램을 만들고자한다.
		//학생 클래스를 정의해보자. Student class는 name(String),classRoom(int),
		//javaScore(double), sqlScore(double),practiceScore(double)값을 가진다.
		//각 필드데이터의 getter/setter, 기본생성자, 모든 필드데이터를 초기화하는 생성자를 작성하고
		//또한 toString : 학생의 정보를 "xx반 xxx학생 xx점 xx점 xx점"으로 정보를 반환하는 메소드 각 전수는 자바, sql, practice순으로 작성
		//		isPassd : 모든 점수가 60점 이상이면서 평균이 60점이상이면 true 아니면 false를 반환하는 메소드
		//		reTest : 학생의 모든 점수를 랜덤 (0 ~ 100)으로 다시부여하는 메소드 반환없음
		
		//학생 10명을 생성하고 reTest를 실행한 후 모든 학생의 점수를 출력해라
		Student[] strArr = new Student[10];
		
		for(int i = 0; i < strArr.length; i++) {
			strArr[i] = new Student();
		
		System.out.println("이름 : ");
		strArr[i].setName(sc.next());
		
		System.out.println("반 : ");
		strArr[i].setClassRoom(sc.nextInt());
		
		strArr[i].reTest();
		}
		
		System.out.printf("%5s %3s %4s $4s %4s","이름","반","자바","sql","실습");
		for(int i = 0; i<strArr.length; i++) {
			Student st = new Student();
			System.out.printf("%5s %3s %4.2f $4.2f %4.2f\n", st.getName(),st.getClassRoom(),st.getJavaScore(),st.getSqlScore(),st.getPracticeScore());
		}
		
		}
}