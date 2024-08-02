package test240719.object1;

public abstract class Animal {
	String name;
	String kinds;
	
	public Animal() {
		
	}
	
	public Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}



	public String toString() {
		return "저의 이름은" + name + "이고, 종류\r\n"
				+ "는 "+ kinds + "입니다.";
	}
	
	public abstract void speak();
}
