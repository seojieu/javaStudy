package cafe;

public class Cafe {
	private String coffeename;
	private int price;
	private String description; 	//설명
	private String option;
	
	public Cafe() {
		super();
	}

	public Cafe(String coffeename, int price, String description, String option) {
		super();
		this.coffeename = coffeename;
		this.price = price;
		this.description = description;
		this.option = option;
	}

	public String getCoffeename() {
		return coffeename;
	}

	public void setCoffeename(String coffeename) {
		this.coffeename = coffeename;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	@Override
	public String toString() {
		return "Cafe [coffeename=" + coffeename + ", price=" + price + ", description=" + description + ", option="
				+ option + "]";
	}
	
	
}
