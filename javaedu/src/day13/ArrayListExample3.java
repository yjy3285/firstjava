package day13;

import java.util.ArrayList;

class ArrayListExample3 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("머루");
		list.add("사과");
		list.add("앵두");
		list.add("자두");
		list.add("사과");
		int index1 = list.indexOf("사과");
		int index2 = list.lastIndexOf("사과"); //인덱스오브는 무조건 앞에서 부터! lastof는 뒤에서부터.
		System.out.println("첫번째 사과: " + index1);
		System.out.println("마지막 사과: " + index2);
	}
}
