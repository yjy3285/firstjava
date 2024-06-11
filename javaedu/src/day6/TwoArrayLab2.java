package day6;

public class TwoArrayLab2 {
	public static void main(String[] args) {
		 char a1[][] = {
				{'B', 'C', 'A', 'A'},
		        {'C', 'C', 'B', 'B'},
		        {'D', 'A', 'A', 'D'}
		};
		 
	        int countA = 0;
	        int countB = 0;
	        int countC = 0;
	        int countD = 0;

	        
	        for (int i = 0; i < a1.length; i++) {
	            for (int j = 0; j < a1[i].length; j++) {
	                switch (a1[i][j]) {
	                    case 'A':
	                        countA++;
	                        break;
	                    case 'B':
	                        countB++;
	                        break;
	                    case 'C':
	                        countC++;
	                        break;
	                    case 'D':
	                        countD++;
	                        break;
	                }
	            }
	        }
	        System.out.println("A 는 " + countA + "개 입니다.");
	        System.out.println("B 는 " + countB + "개 입니다.");
	        System.out.println("C 는 " + countC + "개 입니다.");
	        System.out.println("D 는 " + countD + "개 입니다.");
	      
	    }
}

