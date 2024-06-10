package day5;

public class LottoMachine1 {
	public static void main(String[] args)  {
		int lotto[] = new int[6];
		System.out.print("오늘의 로또 번호- ");
		for(int i = 0; i <lotto.length;i++) {
			int num = (int)(Math.random()*45)+1;
			lotto[i] = num;
			for(int j = 0;j<i;j++) {
				if(lotto[i] == lotto[j]) {   //중복제거
					i--;
					break;
				}
			}
			System.out.print(lotto[i]);
			 if (i == (lotto.length - 1)){
	                System.out.print("\n");
	            } else {
	                System.out.print(", ");
	            }
		}       
}
}
