package day10;
import java.util.Random;

import day7.MethodLab5; //import 안하고 쓰면 에러 뜸. //import day7* 해도 되지만 가독성 떨어지기에 클래스명 붙이기
class Multiplication {
    private int dan;
    private int number;

    Multiplication() {}

    Multiplication(int dan) {
        this.dan = dan;
    }

    Multiplication(int dan, int number){
        this.dan = dan;
        this.number = number;
    }

    void printPart() {
        if (number == 0) { 
            for(int n = 1; n <= 9; n++)
                System.out.print("\t" + dan + "*" + n + "=" + dan * n);
            System.out.println();
        } else {
            System.out.println(dan * number);
        }
    }
}

class GuGuDanExpr extends Multiplication {

    GuGuDanExpr() {}

    GuGuDanExpr(int dan) {
        super(dan);
    }

    GuGuDanExpr(int dan, int number) {
        super(dan, number);
    }

    public static void printAll() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println();
        }
    }
}




public class GuGudDanApp {
    public static void main(String[] args) {
        Random random = new Random();
        //int dan = random.nextInt(20) + 1; 
        int dan = MethodLab5.getRandom(20); //만들어둔 메소드 재활용 , 클래스명 앞에 패키지명 붙여줘도 되긴 함.
        int number = MethodLab5.getRandom(20);
        
        //int number = random.nextInt(20) + 1; 

        System.out.println("dan: " + dan + ", number: " + number);

        if (dan >= 1 && dan <= 9 && number >= 1 && number <= 9) {
            GuGuDanExpr expr = new GuGuDanExpr(dan, number);
            System.out.print(dan + "*" + number  + "=");
            expr.printPart(); //new GuGuDanExpr(dan,number).printpart(); ->이렇게 해도 된다.
        } else if (dan >= 1 && dan <= 9 && number >= 10) {
            GuGuDanExpr expr = new GuGuDanExpr(dan);
            System.out.print(dan + "단 :");
            expr.printPart();
        } else if (dan >= 10) {
            GuGuDanExpr.printAll();
        }
    }
}

