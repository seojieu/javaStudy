package test240710.object3;

public class SnackController {
	
	private Snack s = new Snack();
	
	public SnackController() { 
		super();
		System.out.println("snackController생성됨");
	}
	
	public String saveData(String kind, String name, String flaver, int numOf, int price) {
		s.setKind(kind);
		s.setFlavor(flaver);
		s.setName(name);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "저장 완료되었습니다.";
	}
	
	public String confirmData() {
		return s.information;
	}
}
