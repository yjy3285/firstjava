package work;

abstract class Plane {
	private String planeName;
	private int fuelSize;

	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	public String getPlaneName() {
		return planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public Plane() {
	}

	abstract void flight(int distance);

	public void refuel(int fuel) {
	}

}