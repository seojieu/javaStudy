package test240711.object2;

public class TV {
	//필드
	private String model;
	private int month;
	private int inchi;
	private int price;

	// 생성자
	public TV() {
	}

	public TV(String model, int month, int inchi, int price) {
		super();
		this.model = model;
		this.month = month;
		this.inchi = inchi;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getInchi() {
		return inchi;
	}

	public void setInchi(int inchi) {
		this.inchi = inchi;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 메서드
	public void show() {
		System.out.println(this.model + "에서 만든 " + this.month + "년형 " + this.inchi + "인치 TV 가격 :" + this.price);
	}
}

