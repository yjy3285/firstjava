package 실습4;

public class ForLab6 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 5;
		final char DECO = '&';
		
		for(int i=1; i<=num; i++){
            for (int j = 1;j<=i;j++)
         System.out.print(DECO);
System.out.println();
		}
}
}