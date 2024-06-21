package day14;
public class StringTest {
	public static void main(String[] args) {
		System.out.println("1".length());    		//1의 길이		
		System.out.println("가나다".length()); 		//가나다의 길이	
		System.out.println("abc".charAt(1)); 		//abc의 인덱스 1 값	
		System.out.println("abc".toUpperCase());	//abc를 대문자로 변환 
		
		String str1 = "ABCDEFGHIJ";
		String str2 = "abcdefgfhij";		
		System.out.println(str1.substring(4));     	//인덱스4부터 출력       
		System.out.println(str1.substring(0, 3));  	//인덱스 0부터 (3-1)까지 출력	
		System.out.println(str2.indexOf("f"));      //문자 f에 해당하는 인덱스 값 출력 		  
		System.out.println(str2.lastIndexOf("f"));  //f가 마지막으로 출력되는 인덱스 값 출력    
		System.out.println(str2.replace('h', 'H'));  //h를 H로 변환	
		
		System.out.println("abc".repeat(5)); //abc를 5번 반복
		System.out.println("@".repeat(3));  //@ 3번 반복
		
		String str3 = "java jdbc html5 css javascript servlet jsp ajax";
		String[] ary = str3.split(" ");   
		
		for(int i=0; i < ary.length; i++){
			System.out.println(ary[i]); //ary배열에 담긴 값을 공백기준으로 나눠서 줄바꿈으로 출력
		}		
		char ch[] = str3.toCharArray();
		System.out.println(str3.length() + " ---- " + ch.length); //str3의 길이 
		for(int i=0; i < ch.length; i++){
			System.out.print(ch[i] + " "); //문자 하나당 빈칸 삽입해서 출력
		}
	}
}













