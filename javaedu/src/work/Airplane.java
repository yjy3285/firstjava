package work;

public class Airplane extends Plane {
	public Airplane() {
		super();
	}

	public Airplane(String planeName, int fuelSize) {
		super();

	}

	void flight(int distance) {
		int fuelOperate = distance * 3;
		setFuelSize(getFuelSize() - fuelOperate);
	}

	public void refuel(int fuel) {
		int fuelCharge = fuel;
		setFuelSize(getFuelSize() + fuelCharge);

	}
}
