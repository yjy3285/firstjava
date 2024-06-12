package day7;

public class MethodLab9 {

    // 직각삼각형인지 판별하는 메서드
    public static boolean isRightTriangle(int width, int height, int hypo) {
        return (width * width + height * height == hypo * hypo);
    }

    // main 메서드
    public static void main(String[] args) {
        System.out.println(isRightTriangle(3, 4, 5)); // true
        System.out.println(isRightTriangle(1, 2, 3)); // false
    }
}
