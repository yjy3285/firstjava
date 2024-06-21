package day14;
import java.util.Date;
class Value {
	int value;
	Value(int value) {
		this.value = value;  
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false; //지역변수는 기본 값이 없기 때문에 false 넣어줌.
		if (obj != null && obj instanceof Value)
			if (value == ((Value)obj).value)
				result = true;
		return result; 
	}
}

public class EqualsTest3 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		Value v3 = new Value(20);
		System.out.println(v1.equals(null));  //false //override 한 후, false
		System.out.println(v1.equals(v3)); //false //false
		System.out.println(v1.equals(v2)); //false(참조 객체값 다름) //true
		System.out.println(v1.equals(new Date())); //false //false

		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다."); //오버라이딩 한 후 이거 출력
		else
			System.out.println("v1과 v2는 다릅니다."); //다르니까 이거 출력
		v2 = v1;
		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다."); //값 대입해서 같아졌으니까 이거 출력 //이거 출력
		else
			System.out.println("v1과 v2는 다릅니다.");
	}
}
