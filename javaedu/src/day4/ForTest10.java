package day4;

public class ForTest10 {
	public static void main(String[] args) {
		final char DECO = '*';
		for (int row = 1; row <= 10; row++) {
			for (int count = 1; count <= row; count++)
				System.out.print(DECO);
			System.out.println();
		}
		//밖에 for문 10번 반복
		//안에 for문 55번 반복

		System.out.println();
		for (int count = 1; count <= 1; count++)
			System.out.print('@');
		System.out.println();
		for (int count = 1; count <= 2; count++)
			System.out.print('@');
		System.out.println();
		for (int count = 1; count <= 3; count++)
			System.out.print('@');
		System.out.println();
		for (int count = 1; count <= 4; count++)
			System.out.print('@');
		System.out.println();
		for (int count = 1; count <= 5; count++)
			System.out.print('@');
	}
}
