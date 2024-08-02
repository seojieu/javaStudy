package test240719.object2;

public class Sales extends Employee implements Bonus {
	public Sales() { }

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}


	@Override
	public double tax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void incentive() {
		super.setSalary((int)(super.getSalary() * 2.2));
		
	}
	
	
	}
