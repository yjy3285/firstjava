package day7;

public class MethodLab10 {

    
    public static void powerArray(int[] array, int multiple) {
        if (multiple < 2 || multiple > 5) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] *= multiple;
        }
    }

    
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 5 };
        MethodLab7.printArray(a1);
        powerArray(a1, 3);
        MethodLab7.printArray(a1);

        int[] a2 = { 10, 20, 30, 40, 50, 60 };
        MethodLab7.printArray(a2);
        powerArray(a2, 10);
        MethodLab7.printArray(a2);
    }
}

