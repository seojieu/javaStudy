package fild.practice3;

public class Run {

	public static void main(String[] args) {
		Book b1	= new Book("홍길동전", "길벗", "허균");
		Book b2 = new Book("그대들은 어떻게 살것인가","지브리","모토",15000,0.80);
		Book b3 = new Book("자바란 무엇인가?" , "최지원" , "kh" , 10000 , 0.2);
	
		b1.inform();
		System.out.println();
		b2.inform();
		System.out.println();
		b3.inform();
		System.out.println();
	
	}
		
	}

