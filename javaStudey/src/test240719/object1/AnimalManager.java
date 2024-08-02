package test240719.object1;

public class AnimalManager {

	public static void main(String[] args) {
		// Animal 타입의 객체배열 크기 5로 생성
		Animal[] aniArr = new Animal[5];
		// 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
		// (이때, 매개변수 생성자를 이용하여 생성)	
		aniArr[0] = new Dog("흰둥이", "시고르자브종",20);
		aniArr[1] = new Cat("럭키" , "먼치킨","우리집","흰색");
		aniArr[2] = new Dog("멍구", "시고르자브종", 20);
		aniArr[3] = new Dog("개똥이", "진돗개" , 20);
		aniArr[4] = new Cat("나비" , "먼치킨","옆집","회색");
		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
		// 객체의 speak() 메소드 호출
		
		for(int i = 0; i < aniArr.length; i++) {
			aniArr[i].speak();
				
			}
		}
	}