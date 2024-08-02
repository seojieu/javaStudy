package test240711.object2;

public class Human {
	TV tv = new TV();
	private String name;
	private int useprice;
	
	
	public Human(String name, int useprice) {
		super();
		this.name = name;
		this.useprice = useprice;
	}
	


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getUseprive() {
		return useprice;
	}



	public void setUseprive(int useprice) {
		this.useprice = useprice;
	}



	public void buy(TV tv) {
		if(tv.getPrice() <= this.useprice) {//구매 가능
			System.out.println(this.name + "님 구매내역");
			tv.show();
			this.useprice -= tv.getPrice();
			System.out.println("남은 잔액 : " + this.useprice);
		}	else {
			System.out.println(this.name +"님 잔액이 부족하여 구매하실 수 없습니다");
		}
	}
}
