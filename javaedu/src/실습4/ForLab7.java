package 실습4;

public class ForLab7 {
	public static void main(String[] args) {
		final char STAR = '*';
		for (int row = 7; row >0; row--) {
			for (int count = 0; count < row; count++)
				System.out.print(STAR);
			System.out.println();
		}

}

}