package day7;

import java.util.Random;

public class MethodLab5 {

    
    public static int getRandom(int n) {
        Random random = new Random();
        return random.nextInt(n) + 1;
    }

    
    public static int getRandom(int n1, int n2) {
        Random random = new Random();
        return random.nextInt(n2 - n1 + 1) + n1;
    }

    
    public static void main(String[] args) {
        
        System.out.print("getRandom(10) 호출 결과: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(getRandom(10));
            if (i < 4) System.out.print(", ");
        }
        System.out.println();

        
        System.out.print("getRandom(10, 20) 호출 결과: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(getRandom(10, 20));
            if (i < 4) System.out.print(", ");
        }
        System.out.println();
    }
}
