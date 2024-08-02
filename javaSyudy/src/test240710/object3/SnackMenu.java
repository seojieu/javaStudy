package test240710.object3;

import java.util.Scanner;

public class SnackMenu {
	
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();

	public void menu() {
		String kind;
		String name;
		String flavor;
		int numOf;
		int price;
		
		System.out.println("종류 : ");
		kind = sc.next();
		
		System.out.println("이름 : ");
		name = sc.next();
		
		System.out.println("맛 : ");
		flavor = sc.next();
		
		System.out.println("개수 : ");
		numOf = sc.nextInt();
		
		System.out.println("가격 : ");
		price = sc.nextInt();
		
		//데이터를 setter를 이용해 저장하고 저장완료 되었다는 결과를 반환하는 메소드
		scr.saveData(kind, name, flavor, numOf, price);
		System.out.println(res);
		
		System.out.print("저장한 정보를 확인하시겠습니까? (y/n) : ");
		char ch = sc.next().charAt(0);
	}
}
