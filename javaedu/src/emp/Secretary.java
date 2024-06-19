package emp;

class Secretary extends Employee implements Bonus {
	public Secretary() {

	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	public double tax() {
		return getSalary() * 0.1;
	}

	public void incentive(int pay) {

		int secretaryincentive = (int) (pay * 0.8);
		setSalary((int) (getSalary() + secretaryincentive));

	}

}
