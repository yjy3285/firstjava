package day7;
public class MethodTest7_1 {
	public static void main(String[] args) {
		String result=""; //null 문자열 주고 for문 돌리면 결과값 안 뜸.
		for(int i=0; i <args.length; i++)
			result = result + args[i];
		System.out.println(result);
	}	
}
