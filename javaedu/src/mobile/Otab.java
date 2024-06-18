package mobile;

public class Otab extends Mobile {

	public Otab() {
	}

	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);

	}

	void operate(int time) { //오버라이딩
		int batteryOperate = time * 12;
		setBatterySize(getBatterySize() - batteryOperate);

	}

	void charge(int time) {
		int batteryCharge = time * 8;
		setBatterySize(getBatterySize() + batteryCharge);

	}

}
