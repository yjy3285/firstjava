package day3;

public class ForLab4 {
	public static void main(String[]args) {
		int even = 0;
		int odd = 0;
		
		for(int i =1;i<=100;i++) {
			if(i%2 == 0) {
				even +=i;
			}else {
				odd+=i;
			}
		}
		System.out.printf("1부터 100까지의 숫자들 중에서 짝수의 합은 %d이고 홀수의 합은 %d이다.%n",even,odd);
		
	}

}
