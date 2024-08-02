package test240717.object1;

public class LibraryController {
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	public LibraryController() {
		super();
		
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public void inserMember(Member mem) {
		// 전달받은 mem 주소 값을 해당 회원 레퍼런스(mem)에 대입
		
	}
	
	public Member Member myinfo() {
		// 회원 레퍼런스(mem) 주소 값 리턴
		return mem.toString();
	}
	
	public Book[] selectAll() {
		Book[] bList = lc.selectAll();
		for(int i = 0; i < bList.length; i++) {
			if(bList[i] == null) {
				System.out.println(i + "번 도서 : " + bList);
		
			}
		}
		// 도서 목록 레퍼런스(bList) 주소 값 리턴
		return null;
	}
	
	//제목에 keyword가 포함된 모든 책 검사
	public Book[] searchBook(String keyword) {
		// 검색 결과를 담아줄 새로운 Book 객체 배열 생성
		Book[] tmpBookList = new Book[5];
		
		int index = 0;//앞에서 부터 넣기위해서
		
		for(int i = 0; i < bList.length; i++) {
//			bList[i].getTitle().indexOf(keyword);
			if(bList[i] == null) {
				break;
			}
			
			String title = bList[i].getTitle();
			if(title.indexOf(keyword) != -1) {
				tmpBookList[index] = bList[i];
				index++;
			}
		}
		
		return tmpBookList;
		// 검색 결과 도서 목록이 최대 5개일 수 있으니 임의로 크기 5 할당
		// for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
		// 전달받은 keyword를 포함하고 있으면 → HINT : String 클래스의 contains() 참고
		// 검색결과의 도서목록에 담기 → HINT : count 이용
		// 해당 검색결과의 도서목록 주소 값 리턴
	}
	
	public int rentBook(int index) {
		int result = 0;
		Book b = bList[index];
		
		if ( b instanceof AniBook) {
			int accessAge = ((AniBook) b).getAccessAge();
			int memberAge = this.mem.getAge();
			if(accessAge > memberAge) {
				result = 1;
			}
			
		}else if(b instanceof CookBook) {
			if(((CookBook) b).isCoupon()) {
				this.mem.setCouponCount(this.mem,getCouponCount() +1 );
				result = 2;
			}
		}
				return result;
		// int result = 0;
		// 전달 받은 index의 bList 객체가 만화책을 참조하고 있고
		// 해당 만화책의 제한 나이와 회원의 나이를 비교하여 회원 나이가 적을 경우
		// result를 1로 초기화 → 나이제한으로 대여 불가
		// 전달 받은 index의 bList 객체가 요리책을 참조하고 있고
		// 해당 요리책의 쿠폰유무가 “유”일 경우
		// 회원의 couponCount 1 증가 처리 후
		// result를 2로 초기화 → 성공적으로 대여 완료, 요리학원 쿠폰 발급
		// result 값 리턴
	}
}
