package test.t240703;

import java.util.Scanner;

public class T_03 {

	public static void main(String[] args) {
		/*
		 *
		 */
	
		Scanner sc = new Scanner(System.in);
	
		int[] score = new int[3];
		int sum = 0;
		double avg;
		
		
		System.out.print("국어점수 : ");
		score[0] = sc.nextInt();
		
		System.out.print("수학점수 : ");
		score[1] = sc.nextInt();
	
		System.out.print("국어점수 : ");
		score[2] = sc.nextInt();
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		 avg = ( sum / 3);
		
		if(score[0] <40 || score[1] <40 || score[2] < 40 || avg <60) {
			System.out.println("불합격 입니다.");
		}
		else {
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다. 합격입니다!");
		}
		
//		if(math >= 40 && kor >= 40 && eng >= 40 && (math+kor+eng) /3 > 60) {
//			System.out.println("축하합니다, 합격입니다!");
//					System.out.printf("국어점수: " , kor ,  "\n수학점수: " ,  math , "\n영어점수 : " ,  eng ,  "\n합계 : ",  (kor + math + eng), "\n평균 : " , (kor + math+ eng ) /3 );
//				}else {
//					System.out.println("불합격입니다.");
//			}
		}
	}

