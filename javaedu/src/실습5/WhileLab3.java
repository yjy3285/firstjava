package 실습5;

public class WhileLab3 {
	
	public static void main(String[] args) {
		int num;
		int cnt = 0;
		while(true) {
			num = (int)(Math.random()*31);
			char alpha = (char)('A' + num-1);
			
			if (num == 0 ||(num >=27 && num<=30))
				break;
			
			System.out.printf("%d-%c, %d, 0x%x\n",num,alpha,(int)alpha,(int)alpha);
			cnt++;
			
			System.out.printf("출력횟수는 %d 번입니다.",cnt);
		}
	}
}
