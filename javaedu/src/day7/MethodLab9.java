package day7;

public class MethodLab9 {

    
    public static boolean isRightTriangle(int width, int height, int hypo) {
        return (width * width + height * height == hypo * hypo); //a2 +b2 =c2
    }

    
    public static void main(String[] args) {
        System.out.println(isRightTriangle(3, 4, 5)); 
        System.out.println(isRightTriangle(1, 2, 3)); 
    }
}
