package day18;
enum Season2{
     봄, 여름, 가을 ,겨울
}
public class EnumTest2 {
   public static void main(String args[]) {
      System.out.println(Season2.봄);
      System.out.println(Season2.여름);
      System.out.println(Season2.가을);
      System.out.println(Season2.겨울);     //한글이 되는 이유, uni-code 지원하기 때문.
   }
}
