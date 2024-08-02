package test240717.object1;

import java.util.Scanner;

	
public class LibraryMenu {
	LibraryController lc;
	Scanner sc;
	this.LibraryController lc = new LibraryController();
	this.Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		// 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
		
		 // LibraryController의 insertMember() 메소드에 전달
		 // 무한 반복 실행
		while(true) {
		System.out.println("==== 메뉴 ====");
		System.out.println("1. 마이페이지");// LibraryController의 myInfo() 호출하여 출력
		 System.out.println("2. 도서 전체 조회"); // LibraryMenu의 selectAll() 호출
		 System.out.println("3. 도서 검색"); // LibraryMenu의 searchBook() 호출
		 System.out.println("4. 도서 대여하기");// LibraryMenu의 rentBook() 호출
		System.out.println("9. 프로그램 종료하기");
		System.out.print("메뉴 번호 :");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			lc.myInfo();
		case 2:
			this.selectAll();
		case 3:
			this.searchBook();
		case 4:
			this.rentBook();
		case 9:
			System.out.println("프로그램을 종료합니다.");
			return;
		default :
		}lc.inserMember(null);
		}
	}
	
	public void selectAll() {
		Book[] bList  = lc.selectAll();
		for(int i = 0; i < bList.length; i++) {
			if(bList[i] == null) {
				break;
			}
			System.out.println( i + "번 도서 : " + bList[i].toString());
		}
		// LibraryController의 selectAll()메소드 호출하여 결과 값 Book[] 자료형 bList에 담기
		// for문 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
		

	}
	
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.next();
		Book[] bookList = lc.searchBook(keyword);
		
		// “검색할 제목 키워드 : “ >> 입력 받음 (keyword)
		// LibraryController의 searchBook() 에 전달
		// 그 결과 값을 Book[] 자료형 searchList에 담아 검색 결과인 도서 목록 출력
	}
	
//	public void printBookList(Book[] bList) {
//		for(int i = 0; i < bList.length; i++) {
//			if(bList[i] == null) {
//				break;
//			}
//			System.out.println(i + "번 도서 : " + bList[i].toString());
//		}
//	}
	public void rentBook() {
		lc.selectAll();
		System.out.println("대여할 도서 번호 선택 : ");
		int num = sc.nextInt();
		int result = lc.rentBook(num);
		switch(result) {
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
		}
		// 도서대여를 위해 도서번호를 알아야 하기 때문에 selectAll() 메소드 호출
		// “대여할 도서 번호 선택 : ” >> 입력 받음 (index)
		// LibraryController의 rentBook() 에 전달
		// 그 결과 값을 result로 받고 그 result가
		// 0일 경우 → “성공적으로 대여되었습니다.” 출력
		// 1일 경우 → “나이 제한으로 대여 불가능입니다.” 출력
		// 2일 경우 → “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니
		// 마이페이지에서 확인하세요” 출력
		
		
	}
}
