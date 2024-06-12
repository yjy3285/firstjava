package day7;

public class MethodLab1 {

    
    public static void printTitle() {
        System.out.print("이것이 자바다"); //한줄에 출력되야하기에 println 하면 안되고 print해야함.
    }

    
    public static int getPrice() {
        return 36000;
    }

   
    public static void main(String[] args) {
        System.out.print("우리의 자바교재명은 <");
        printTitle();
        System.out.println(">입니다.");
        System.out.printf("가격은 %,d원입니다.%n", getPrice()); //가격 리턴하는 것이기에 호출한 쪽에서 출력해줘야함. ,넣을거기에 printf사용,\n,%n둘다 사용가능
    }
}

		


