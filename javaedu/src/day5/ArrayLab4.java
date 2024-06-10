package day5;

public class ArrayLab4 {
    public static void main(String[] args) {
       
        int randomSize = (int) (Math.random() * 6) + 5;

      
        int[] intArray = new int[randomSize];
        for (int i = 0; i < randomSize; i++) {
            intArray[i] = (int) (Math.random() * 26) + 1;
        }

      
        char[] charArray = new char[randomSize];

      
        for (int i = 0; i < randomSize; i++) {
            charArray[i] = (char) (intArray[i] - 1 + 'a');
        }

       
        for (int i = 0; i < randomSize; i++) {
            System.out.print(intArray[i]);
            if (i < randomSize - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = 0; i < randomSize; i++) {
            System.out.print(charArray[i]);
            if (i < randomSize - 1) {
                System.out.print(",");
            }
        }
    }
}
