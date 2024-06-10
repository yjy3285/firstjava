package 실습5;

public class ControlLab1 {
	public static void main(String[] args) {
		
		int sum = 0;
		int cnt = 0;
		
		while(true) {
			int num = (int)(Math.random()*11) + 10;
			System.out.println("num : " + num);
			
			if(num%3 == 0 ||num % 5 == 0) {
				for(int i = 1;i<=num;i++)
					sum +=i;
				cnt++;
				System.out.println("sum: " + sum);
			}else if(num==11 ||num == 17 ||num ==19) {
				break;
			}else {
				System.out.println("재수행");
				continue;
			}
		}
		System.out.printf("%d회 반복함\n" , cnt);
	}

	
	
	
	
}
			


