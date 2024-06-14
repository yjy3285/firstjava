package day9;

import java.util.Scanner;
class GradeExpr {

	int[] jumsu = {};

	GradeExpr(int[] jumsu) {
		this.jumsu = jumsu;
	}
	double getAverage() {
		return getTotal() /jumsu.length;
	}
	int getTotal() {
		int sum=0;
		for(int i=0;i<jumsu.length;i++) {
			sum+=jumsu[i];
		}
			return sum; 
	}
//	int getGoodScore() {
//		for(int i=0;i<jumsu.length;i++) {
//			
//		}
//	}
//	int getBadScore() {
//		
//	}

}
public class GradeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("처리하려는 점수의 갯수를 입력하세요 : ");

		int number = sc.nextInt();
		int[] ary = new int[number];
		for (int i = 0; i < number; i++) {
			ary[i] = sc.nextInt();
		}
		
		for (int i = 0; i < number; i++) {
			System.out.print(ary[i]);
			if (i < ary.length - 1) {
				System.out.print(",");
			}
		}
		GradeExpr gr = new GradeExpr(ary);
		sc.close();

	}

}



