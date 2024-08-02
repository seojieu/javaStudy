package test240710.object4_1;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		private Scanner sc = new Scanner(System.in);
		

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
			
			Snack sn = new Snack(kind,name, flavor,numOf, price);
			System.out.println("저장되었습니다.");
			
			System.out.print("저장한 정보를 확인하시겠습니까? (y/n) : ");
			char ch = sc.next().charAt(0);
			if (ch == 'y') {
				//저장된 데이터를 반환하는 메소드
				String res = sn.information();
				System.out.println(res);
		}

	}

}
