package 실습4;

public class ForLab9 {
	public static void main(String[] args) {
		int dan = (int)(Math.random()*2)+1;
		for (int i=dan;i<=9;i+=2) {
			for(int j=1;j<=9;j++){
			System.out.print(i + " x " + j + " = " + i*j + "\t");
			}
			System.out.println();
			}
			}
			}