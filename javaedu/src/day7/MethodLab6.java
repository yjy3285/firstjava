package day7;

public class MethodLab6 {

    
    public static int maxNumArray(int[] array) {
        int max = array[0];
    	
        for (int num : array) {
            if (num > max) { //꺼내온 데이터가 max 보다 크면 그것을 max로 바꾸주면 되는 것.
                max = num;
            }
        }
        return max;
    }

    
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30};
        int[] array2 = {100, 500, 300, 200, 400};
        int[] array3 = {1, 10, 3, 4, 5, 8, 7, 6, 9, 2};

        System.out.println("가장 큰 값은 " + maxNumArray(array1) + " 입니다.");
        System.out.println("가장 큰 값은 " + maxNumArray(array2) + " 입니다.");
        System.out.println("가장 큰 값은 " + maxNumArray(array3) + " 입니다.");
    }
}

