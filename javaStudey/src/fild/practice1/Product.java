package fild.practice1;

public class Product {
	
	//필드
	private String pName;
	private int price;
	private String brand;
	
	//생성자
	public Product () { }
	
	public Product(String name, int price, String brand) {
		this.pName = name;
		this.price = price;
		this.brand = brand;
	}
	
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	//메서드
	public void information() {
		System.out.print("이름 : " + this.pName + "\n가격 : " + this.price + "\n브랜드 :" + this.brand);
	}
	
	
}
