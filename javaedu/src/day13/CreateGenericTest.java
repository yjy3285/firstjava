package day13;

import java.util.Date;

public class CreateGenericTest {

	public static void main(String[] args) {
		Value1 v1 = new Value1();
		v1.put("가나다");
		String s1 = v1.get();
		System.out.println(s1);
		
		Value2 v2 = new Value2();
		v2.put("가나다");
		String s2 = v1.get();
		System.out.println(s2);
		
		v2.put(new Date());
		Date d1 = (Date)v2.get();
		System.out.println(d1);
		
		v2.put("가나다");
		Date d2 = (Date)v2.get();
		System.out.println(d2);
		
		Value3<String> v3 = new Value3<>();
		v3.put("가나다");
		String s3 = (String)v2.get();
		System.out.println(s3);
		
		Value3<Date> v4 = new Value3<>();
		v4.put(new Date());
		Date d3 = v4.get();
		System.out.println(d3);
		
		
		
		

	}

} class Value1 {
	
	String obj;
	void put(String obj) {
		this.obj = obj;
	}
	String get() {
		return obj;
	}
}
class Value2 {
	
	Object obj;
	void put(Object obj) {
		this.obj = obj;
	}
	Object get() {
		return obj;
	}
}
//String(str)은 문자열 데이터를 저장하는 타입입니다. Object는 문자열 뿐만아니라 다양한 형태의 데이터를 저장할 수 있습니다.
class Value3<TT> { //제너릭스 적용한 코드
	
	TT obj;
	void put(TT obj) {
		this.obj = obj;
	}
	TT get() {
		return obj;
	}
}
