package mobile;

public class Ltab extends Mobile {
	public Ltab() {
		super();
	}

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);

	}

	void operate(int time) {
		int batteryOperate = time * 10;
		setBatterySize(getBatterySize() - batteryOperate);

	}

	void charge(int time) {
		int batteryCharge = time * 10;
		setBatterySize(getBatterySize() + batteryCharge);

	}

}
