package day6;

public class TwoArrayTest1 {
	public static void main(String[] args) {
		int[][] two = new int[2][10];
		System.out.println(two);
		System.out.println(two[0]);
		System.out.println(two[1]);
		System.out.println(two[0][0]);	//크기만 지정했기에 0이 출력
		System.out.println(two.length); //행의 크기 출력
		System.out.println(two[0].length); //첫번째 행이 참조하는 열의 크기출력
		
		for(int row=0;row < two.length;row++) {
			for(int col=0; col < two[row].length; col++)
				System.out.print(two[row][col]+" ");
			System.out.println();
		}
	}
}



