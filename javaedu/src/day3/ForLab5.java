package day3;

public class ForLab5 {
	public static void main(String[] args) {
		int firstrandom = (int)(Math.random()*8)+3;
		int secondrandom = (int)(Math.random()*3)+1;
		
		switch(secondrandom) {
		case 1 :
			for(int i = 0;i<firstrandom;i++) {
				System.out.print("*");
			}
			break;
		case 2 :
			for(int i =0;i<firstrandom;i++) {
				System.out.print("$");
			}
			break;
		case 3 :
			for(int i =0;i<firstrandom;i++) {
				System.out.print("#");
			}
			break;
		
		}
		
	}

}
