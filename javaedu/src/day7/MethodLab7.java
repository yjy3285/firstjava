package day7;

public class MethodLab7 {

    
    public static int[] powerArray(int multiple) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (i + 1) * multiple;
        }
        return array;
    }

    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
    	
        int[] array1 = powerArray(2);
        int[] array2 = powerArray(3);
        int[] array3 = powerArray(4);
        
       
        printArray(array1); //array1 지정대신 괄호 안에 바로 powerarray(2)를 넣어도 된다.
        printArray(array2);
        printArray(array3);
    }
}
