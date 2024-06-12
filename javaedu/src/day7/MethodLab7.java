package day7;

public class MethodLab7 {

    // 1부터 10까지의 값을 배수로 변환하여 배열을 리턴하는 메서드
    public static int[] powerArray(int multiple) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (i + 1) * multiple;
        }
        return array;
    }

    // 배열의 값을 출력하는 메서드
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    // main 메서드
    public static void main(String[] args) {
        int[] array1 = powerArray(2);
        int[] array2 = powerArray(3);
        int[] array3 = powerArray(4);

        printArray(array1);
        printArray(array2);
        printArray(array3);
    }
}
