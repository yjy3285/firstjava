package day7;

public class MethodLab2 {

    
    public static void printTriangle(char character, int rows) {
        for (int i = 1; i <= rows; i++) {
            
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k < i; k++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        printTriangle('@', 3);
        System.out.println();
        printTriangle('%', 4);
        System.out.println();
        printTriangle('A', 5);
    }
}
