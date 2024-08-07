package cafemenu;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cafe.Cafe;
import cafecontroller.CafeController;

public class CafeMenu {

	Scanner sc = new Scanner(System.in);
	CafeController cc = new CafeController();
	List<Cafe> coffee = new ArrayList<>();  		//커피 리스트 생성
	List<Cafe> latte = new ArrayList<>();			//라떼 리스트 생성
	List<Cafe> tea = new ArrayList<>();				//티 리스트 생성
	List<Cafe> ade = new ArrayList<>(); 			//에이드 리스트 생성
	List<Cafe> dessert = new ArrayList<>();		//디저트 리스트 생성
	
	public CafeMenu() {	// 각각의 리스트의 이름, 가격, 설명 추가
		coffee.add(new Cafe( coffeename: "아메리카노", price: "W 5.0", description: "물과 에스프레소를 석은 음료"));
		coffee.add(new Cafe( coffeename: "카페모카", price: "W 4.0", description: "커피와 초콜릿이 결합된 인기 있는 음료"));
		coffee.add(new Cafe( coffeename: "카라멜마끼아또", price: "W 3.5", description: "스팀 밀크와 바닐라 시럽을 베이스로 한 크리미하고 달콤한 에스프레소 음료"));
		
		latte.add(new Cafe( coffeename: "녹차라떼", price: "W 3.5", description: "말차와 스팀 밀크를 혼합한 부드럽고 상쾌한 음료"));
		latte.add(new Cafe( coffeename: "고구마라떼", price: "W 3.5", description: "고구마 퓨레와 스팀 밀크를 사용하여 만든 음료"));
		latte.add(new Cafe( coffeename: "초코라떼", price: "W 3.5", description: "에스프레소와 스팀 밀크에 초콜릿 시럽이나 코코아 파우더를 혼합하여 만든 음료"));
		
		tea.add(new Cafe( coffeename: "아메리카노", price: "W 5.0", description: "물과 에스프레소를 석은 음료"));
		tea.add(new Cafe( coffeename: "아메리카노", price: "W 5.0", description: "물과 에스프레소를 석은 음료"));
		tea.add(new Cafe( coffeename: "아메리카노", price: "W 5.0", description: "물과 에스프레소를 석은 음료"));
		
		
		public void MainMenu() {
		System.out.println("== Welcome KH Cafe ==");
		System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
		System.out.println("");
		System.out.println("[ Cafe MENU ]");
		System.out.println("1. coffee					| 커피가 들어간 음료");
		System.out.println("2. latte                   	| 우유가 들어간 음료");
		System.out.println("3. tea 						| 찻잎을 우린 음료");
		System.out.println("");

		while (true) {
			System.out.println("************* 메인 메뉴 ****************");
			System.out.println("1. 매뉴 표시 ");
			System.out.println("2. 주문 선택 ");
			System.out.println("3. 결제 처리 ");
			System.out.println("4. 주문 확인 ");
			System.out.println("9. 끝내기 ");
			System.out.print("메뉴 입력 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				this.showmenu();
				break;
			case 2:
				this.choicemenu();
				break;
			case 3:
				this.payment();
				break;
			case 4:
				this.checkorder();
				break;
			case 9:
				System.out.println("키오스크 프로그램 종료");
				return;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
			}	
		}

	public void showmenu() {
		//메뉴를 저장
		System.out.println("==== 새 음료 추가 ===");
		System.out.println("메뉴 정보를 입력해주세요.");
		System.out.println("도서명 : ");
		String title = sc.nextLine();
		
		System.out.println("저자명 : ");
		String author = sc.nextLine();
		
		System.out.println("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 자기개발 / 5. 기타 )");
		int categoryNumber = sc.nextInt();
		
		String genre = "기타";
		switch(categoryNumber) {
		case 1:
			genre = "인문";
			break;
		case 2:
			genre = "과학";
			break;
		case 3:
			genre = "외국어";
			break;
		case 4:
			genre = "자기개발";
			break;
		}
		
		System.out.println("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		Book newBook = new Book(title,author, genre, price);
		bc.insertBook(newBook);
	}
	
	}
	
	public void choicemenu() {
		
	}
	
	public void payment() {
		
	}
	
	public void checkorder() {
		
	}

}
