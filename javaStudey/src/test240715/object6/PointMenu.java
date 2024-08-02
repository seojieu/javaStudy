package test240715.object6;

import test240715.object5.*;
import java.util.Scanner;

public class PointMenu {
	protected Scanner sc = new Scanner(System.in);
	protected CircleController cc = new CircleController();
	protected RectangleController rc = new RectangleController();
	
	int num;
	public void mainMenu() {
		while(true) {
		System.out.println("=====메뉴=====");
		
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("3. 끝내기");
		System.out.print("메뉴번호 : ");
		
		num = sc.nextInt();
		switch(num) {
		case 1 :
			this.circleMenu();
			break;
		case 2 :
			this.retangleMenu();
			break;
		case 3 :
			System.out.println("종료합니다.");
			break;
			default :
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		}
		
		}
	}
		public void  circleMenu() {
			System.out.println("=====원 메뉴=====");
			
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴번호 : ");
			num = sc.nextInt();
			switch(num) {
			case 1:
				this.calcCircum();
			case 2:
				this.calcCircleArea();
			case 9:
				this.mainMenu();
				default:
					
			}
			}

		public void retangleMenu() {
		System.out.println("=====메뉴=====");
			
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴번호 : ");
			num = sc.nextInt();
			switch(num) {
			case 1:
				this.calcPerimeter();
				break;
			case 2:
				this.calcRectArea();
				break;
			case 9:
				this.mainMenu();
				default:
			}
			}
	
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int num1 = sc.nextInt();
		System.out.print("y 좌표 : ");
		int num2 = sc.nextInt();
		System.out.print("반지름 : ");
		int num3 = sc.nextInt();
		// 데이터를 CircleController(cc)의 calcCircum()의 매개변수로 보내 반환 값 출력
		System.out.println(cc.calcCircum(num1, num2, num3));
	}
	
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int num1 = sc.nextInt();
		System.out.print("y 좌표 : ");
		int num2 = sc.nextInt();
		System.out.print("반지름 : ");
		int num3 = sc.nextInt();
		// 데이터를 CircleController(cc)의 calcArea()의 매개변수로 보내 반환 값 출력
		System.out.println(cc.calcArea(num1, num2, num3));
	}
	public void  calcPerimeter() {
		System.out.print("x 좌표 : ");
		int num1 = sc.nextInt();
		System.out.print("y 좌표 : ");
		int num2 = sc.nextInt();
		System.out.print("높이 : ");
		int num3 = sc.nextInt();
		System.out.print("너비 : ");
		int num4 = sc.nextInt();
		// 데이터를 RectangleController(rc) calcPerimeter()의 매개변수로 보내 반환값 출력
		System.out.println(rc.calcPerimeter(num1, num2, num3, num4));
	}

	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int num1 = sc.nextInt();
		System.out.print("y 좌표 : ");
		int num2 = sc.nextInt();
		System.out.print("높이 : ");
		int num3 = sc.nextInt();
		System.out.print("너비 : ");
		int num4 = sc.nextInt();
		// 데이터를 RectangleController(rc) calcArea()의 매개변수로 보내 반환값 출력
		System.out.println(rc.calcArea(num1, num2, num3, num4));
	}
}
