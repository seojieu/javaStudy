package test240711.object3;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		Book[] arr = new Book[3];
//		
//		arr[0] new Book("안녕","소설,","김철수",50);
//		System.out.println(arr[0].toString());
		/*
		 	우리는 도서관에서 책을 관리하는 프로그램을 만들려고 한다.
		 	해당 클래스는 도서관에 책을 등록할 때 사용하는 book객체를 생성할 Book클래스이다.
		 	필요하다고 생각하는 데이터와 기능을 구현해보자
		 */
		
		//사용자로부터 제목,장르, 저자, 책번호를 입력받아
		//b1이라는 객체를 생성하고 생성된 객체의 toString메소드를 호출하여 모든 정보를 확인하자
		
		
		
	//	Book b1= null, b2 = null, b3=null;
		Book[] bArr = new Book[10];
		
		int menu = 0;
		while(menu !=9) {
		System.out.println("===============도서관리 프로그램=================");
		System.out.println("1. 도서등록");
		System.out.println("2. 도서목록 출력");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 삭제");
		System.out.println("9. 종료");
		System.out.println("메뉴 선택 : ");
		menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1:
			String title, genre, author;
			int num;
			System.out.print("도서 제목 : ");
			title = sc.nextLine();
			
			System.out.print("장르 : ");
			genre = sc.next();

			System.out.print("저자 : ");
			author = sc.next();
			
			System.out.print("책번호 : ");
			num = sc.nextInt();
			
			Book tmpBook = new Book(title, genre, author,num);
			if (b1 == null) {
				
			}else if (b2 == null) {
			}else if (b3 == null) {
			}else {
				System.out.println("이미 등록할 수 있는 책이 가득 찼습니다.");
				break;
			}
		}
			}
		System.out.println("책을 등록하였습니다.");
		System.out.println(tmp.Book.toString());
		break;
		case 2:
			System.out.println("======================등록 도서목록========================");
				for(int i = 0; i<bArr.length; i++) {
					if(bArr[i] == null) {
					break;
//			if(b1 != null) {
//				System.out.println(b1.toString());
//			}
//			if (b2 != null) {
//				System.out.println(b2.toString());
//			}
//			if (b3 != null) {
//					System.out.println(b3.toString());
//				}
					break;
		case 3:
			System.out.println("================도서 검색=====================");
			System.out.print("검색할 책 이름을 입력 : ");
			String target = sc.nextLine();
			//제목 : 아프니까 청춘이다 장르 : 에세이  저자 : 최지원 책번호 : 150
			//or 입력하신 제목의 책은 등록되어있지 않습니다.
			
			for(int i = 0; i < bArr.length; i++) {
				if(bArr[i] == null) {
					break;
				if(target.equals(bArr[i].getTitle())) {
				System.out.println(bArr[i].toString());
			}
			}
			
//			if(b1 != null && target.equals(b1.getTitle)) {
//				System.out.println(b1.toString());
//			}else if (b2 != null&& target.equals(b2.getTitle)) {
//				System.out.println(b2.toString());
//			}	else if (b3 != null && target.equals(b3.getTitle)) {
//					System.out.println(b3.toString());
//				} else {
//					System.out.println("입력하신 제목의 책은 등록되어있지 않습니다.");
//				}
			break;
			case 4:
				System.out.println("====================등록 도서목록==================");
				for(int i = 0; i<bArr.length; i++) {
					if(bArr[i] == null) {
						break;
					}
					System.out.println(bArr[i].toString());
					}
				
				System.out.print("삭제할 도서의 번호 입력 : ");
				int num = sc.nextInt();
				
				//배열에서 해당 책 삭제
				
				//배열에서 번호가 47번인 Book객체 찾기
				for(int i = 0; i < bArr.length; i++) {
					if(bArr[i] == null) {
						System.out.println("삭제할 도서의 번호를 찾지 못하였습니다.");
						break;
					} else if(num == bArr[i].getNum()) {
						System.out.println("삭제 데이터 : " + bArr[i].toString());
						
						//삭제할 위치부터 마지막위치까지 모든 값을 한칸씩 앞으로 당김
						for(int j = i; j < (bArr.length -1); j++) {
							bArr[j] = bArr[j+1];
						}
						//마지막 값에 null대입
						bArr[bArr.length -1] = null;
						
						break;
				}
					
					}
				}
				
				break;
		case 9:
			System.out.println("프로그램을 종료합니다.");
			break;
			default:
		}
	
		Book b1 = new Book(title,genre,author,num);
		System.out.println("책을 등록하였습니다.");
		System.out.println(b1.toString());
	}
}
}