package day7;

import java.util.Random;

public class MethodLab4 {

    
    public static int dif(int num1, int num2) {
        return Math.abs(num1 - num2); //절대값 함수
        //return a>b ? a-b : b-a;
    }

    
    public static void main(String[] args) {
        Random random = new Random(); //랜덤 클래스 사용
        
        for (int i = 0; i < 5; i++) {
            int num1 = random.nextInt(30) + 1; 
            int num2 = random.nextInt(30) + 1; 

            int difference = dif(num1, num2);

            System.out.println(num1 + " 와 " + num2 + " 의 차는 " + difference + " 입니다.");
            //System.out.println("%d 와 %d 의 차는 %d 입니다.\n", num1, num2, dif(num1,num2))
        }
    }
}

