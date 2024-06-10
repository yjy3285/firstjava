package day5;

public class ArrayLab1 {
	public static void main(String[] args) {
		int[] ary = new int[10];
		for(int i=0; i < ary.length;i++)
			System.out.print(ary[i] + " ");
		ary[0] = 10;
		ary[1] = 20;
		ary[2] = 30;
		ary[3] = 40;
		ary[4] = 50;
		ary[5] = 60;
		ary[6] = 70;
		ary[7] = 80;
		ary[8] = 90;
		ary[9] = 100;
		//for(int i=0;i<ary.length,i++)
		//ary[i] = 10*(i+1)
		System.out.println();
		System.out.println("첫 번째: " + ary[0]);
		System.out.println("마지막: " + ary[9]);
		System.out.println("합 : " + (ary[0]+ary[9]));
		
		for(int i=0; i < ary.length;i++)
			System.out.print(ary[i] + " ");
		System.out.println();
		for(int i=ary.length-1;i>=0; i--) 
			System.out.print(ary[i] + " "); 
		System.out.println();
		for(int i=1; i < ary.length;i+=2) //인덱스 2씩 증가
			System.out.print(ary[i] + " ");
		
		

}
}