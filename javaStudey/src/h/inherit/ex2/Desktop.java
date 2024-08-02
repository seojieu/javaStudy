package h.inherit.ex2;

public class Desktop extends Product {
	private boolean allionOne;
	
	public Desktop() {
		super();
		System.out.println("Desktop()");
	}
	
	public Desktop(String brand, String pCode, String pName, int price) {
	super( brand,pCode,pName,price);
	this.allionOne = allionOne;
	}
	
	//오버라이딩
	//->부모클래스에 있는 메소드를 자식 클래스에서 내용만 재정의 하는 것
	@Override
	public String information() {
		return super.information() +" 올인원 : " + this.allinOne;
	}
}