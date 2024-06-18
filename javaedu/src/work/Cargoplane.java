package work;

public class Cargoplane extends Plane {
	public Cargoplane() {
		super();
	}

	public Cargoplane(String planeName, int fuelSize) {
		super();

	}

	void flight(int distance) {
		int fuelOperate = distance * 5;
		setFuelSize(getFuelSize() - fuelOperate);
	}

	public void refuel(int fuel) {
		int fuelCharge = fuel;
		setFuelSize(getFuelSize() + fuelCharge);

	}
}
