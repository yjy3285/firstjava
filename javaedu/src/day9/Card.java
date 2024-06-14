package day9;

public class Card{	
	public String kind ;		// 카드의 무늬 - 인스턴스 변수
	int number;		// 카드의 숫자 - 인스턴스 변수
	static int width = 100;	// 카드의 폭   - 클래스 변수
	static int height = 250;	// 카드의 높이 - 클래스 변수	
} //static은 명시적 초기화 많이함(변수 넣어주면서 값 초기화 하는 것)
//어떤 클래스든 클래스 로딩은 한번만 일어남.
