package day5;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] score = new int[5];
		
		System.out.println(score.length);
		System.out.println(score);
		System.out.println(score[0]);
		System.out.println(score[4]);
		//System.out.println(score[5]);
		
		score[0] = 15;
		System.out.println(score[0]);
		
		score[3] = score[0]*2;
		for(int i=0; i < score.length;i++)
			System.out.print(score[i] + " ");
		System.out.println();
		for(int i=score.length-1;i>=0; i--) //역순으로 출력 ,length 사용하면 배열이 바뀌더라도 for문을 수정할 필요가 x
			System.out.print(score[i] + " "); 
		System.out.println();
		
		for(int elem: score) //원하는 데이터 인식은 못함.크기 변경 문제
			System.out.print(elem + " "); 
		System.out.println();
		//10,20,30,40,50
		
		for(int i=0;i < score.length;i++) { 
			score[i]=(i+1)*10;}
			
		for(int elem :score)
			System.out.print(elem + " ");
		System.out.println();
		
		score=new int[] {11,12,13,14};
		System.out.println(score.length);
		System.out.println(score);
		for (int elem : score)
			System.out.print(elem + " ");
		
		
		
		
			
			
	}

}
