package emp;

class Sales extends Employee implements Bonus {
	public Sales() {
		
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	public double tax() {
		return getSalary() * 0.13;
	}

	public void incentive(int pay) {
		int salesincentive = (int) (pay * 1.2);
		setSalary((int) getSalary() + salesincentive);
	}

	public double getExtraPay() {
		return getSalary() * 0.03;

	}

}
