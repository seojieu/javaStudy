package test240710.object3;

public class Snack {
	//필드
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	//생성자
	public Snack() {
		super();
	}

	public Snack(String kind, String name, String flavor, int numOf, int price) {
		super();
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	//메서드
	public String information() {
		String info = this.kind + " ( " + this.name + "-" + this.flavor + ")" + " " +
							this.numOf + "개 " + this.price + "원 입니다"
		return ;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getNumOf() {
		return numOf;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}