package f.object.ex4;

public class Run {

	public static void main(String[] args) {
		Member jieun = new Member();
		jieun.changeName("서지은");
		jieun.printName();
		
		//아이디, 비번, 이름을 초기화하는 생성자를 통해
		//객체를 하나 생성하고 printName()를 통해 이름을 출력해라
		Member sumin = new Member("21101821","sumin0101", "서지은");
		sumin.printName();
	}

}
