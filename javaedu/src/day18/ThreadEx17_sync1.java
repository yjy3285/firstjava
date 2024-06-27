package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadEx17_sync1 {
	public static void main(String[] args) throws Exception {
		List<Character> buffer = Collections.synchronizedList(new ArrayList<>()); //동기화 부여한 리스트객체 생성
		Thread t1 = new ShareThread1(buffer);
		Thread t2 = new ShareThread2(buffer);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("버퍼의 크기 : " + buffer.size());
		for (char e : buffer)
			System.out.print(e);
	}
}
