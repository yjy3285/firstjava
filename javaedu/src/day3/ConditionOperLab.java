package day3;

public class ConditionOperLab {
	public static void main(String[] args) {
		int result = (int) (Math.random() * 5) + 1;
		int a = 300;
		int b = 50;
		int calculate;
		if (result == 1) {
			calculate = a + b;
		} else if (result == 2) {
			calculate = a - b;
		} else if (result == 3) {
			calculate = a * b;
		} else if (result == 4) {
			calculate = a / b;
		} else {
			calculate = a % b;
		}
		System.out.println("결과값 : " + calculate);
	}

}
