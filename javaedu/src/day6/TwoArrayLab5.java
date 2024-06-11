package day6;

public class TwoArrayLab5 {
	
    public static void main(String[] args) {
        
        int[][] array = new int[5][3];
        

        printArray(array);
        System.out.println();
        // 배열에 규칙에 맞게 데이터 대입
       
        for (int i = 0; i < array.length; i++) {
        	array[i][0] = i + 1; 
        	if (i>0 && i<4) {
        		array[i][1] = 5 + i; 
        	}
        	if (i > 1 && i < 3) {
        		array[i][2] = 7 + i; 
        	}
        }
        printArray(array);
    }
    public static void printArray(int[][] array) {
    	for (int i = 0; i < array.length; i++) {
    		for (int j = 0; j < array[i].length; j++) {
    			System.out.print(array[i][j] + "\t");
    		}
    		System.out.println();
    	}
    }
}
    
        
        

   
    

       

