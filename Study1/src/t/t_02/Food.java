package t.t_02;

public class Food {
	private String name;
	private int kcal;
	
	public Food() {
		super();
	}

	public Food(String name, int kcal) {
		super();
		this.name = name;
		this.kcal = kcal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", kcal=" + kcal + "]";
	}
	
	public void fileSave(String fileName) {
		File f1 = new File()
	}
	
}
