package test240711.object2;

public class Run {

	public static void main(String[] args) {
		//다음과 같은 코드를 실행했을 때 예시와 같은 결과가 출력되도록 TV클래스를 작성하세요
		/*
		 	TV myTV = new TV("삼성",2020, 65,1000000);
		 	myTV.show();
		 	TV myTV2 = new TV("LG",2024, 85,5000000);
		 	myTV.show();
		 	
		 	삼성에서 만든 2020년형 65인치 TV 가격 : 1000000
		 	LG에서 만든 2024년형 85인치 TV 가격 : 5000000
		 */
		
		
		TV myTV = new TV("삼성",2020,65,1000000);
		myTV.show();
		TV myTV2 = new TV("LG",2024,85,5000000);
		myTV2.show();
		
		
		//=========================================================
		/*
		 	one 이라는 Human객체를 생성하고 해당 객체를 이용해서 myTV와 myTV2를 구매 가능한지 확인하는 코드를 작성하고자 한다.
		 	
		 	Human one = new Human("최지원",1000000);
		 	one.buy(myTV);
		 	
		 	"최지원님 구매내역"
		 	 "삼성에서 만든 2020년형 65인치 TV 가격 : 1000000" -> (돈차감)
		 	 남은 잔액 : XXX
		 	 or
		 	 "최지원님 잔액이 부족하여 구매하실 수 없습니다"
		 */
		
		Human one = new Human("최지원",1000000);
		one.buy(myTV);
	}

}