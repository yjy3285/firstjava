package day6;

public class TwoArrayLab4 {
	public static void main(String[] args) {
		int[][] a1 = {
	            {10, 20, 30, 40, 50}, 
	            {5, 10 ,5}, 
	            {11, 22, 33, 44}, 
	            {9, 8, 7, 6, 5, 4, 3, 2, 1}  
	        };
		
		int[] Sum = new int[4]; 
		
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                Sum[i] += a1[i][j]; 
            }
        }
        for (int i = 0; i < Sum.length; i++) {
            System.out.println((i+1) + "행의 합은 " + Sum[i] + "입니다.");
        }
        
        
	}

}
