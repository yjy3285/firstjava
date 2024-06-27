package day18;
//
//class Thread1 implements Runnable {
//	public void run() {
//
//		try {
//			for (char i = 'A'; i < 'M'; i++) {
//
//				System.out.println(i);
//				Thread.sleep(2000);
//
//			}
//
//		} catch (InterruptedException e) {
//			System.out.println("Child interrupted.");
//		}
//		System.out.println();
//
//	}
//}
//
//class Thread2 implements Runnable {
//	public void run() {
//		try {
//			for(int i =1;i<31;i++) {
//				System.out.println(i);
//				Thread.sleep(1000);
//				
//			}
//		} catch(InterruptedException e) {
//			System.out.println("Child interrupted.");
//		}
//	System.out.println();
//}
//}
//
//class ThreadLab {
//	public static void main(String[] args) {
//		Thread t = new Thread(new Thread1(), "DEMO THREAD");
//		t.start();
//		try {
//			for (char j = 'a'; j < 'h'; j++) {
//				System.out.println(j);
//				Thread.sleep(3000);
//			}
//		} catch (InterruptedException e) {
//			System.out.println("Main thread interrupted.");
//		}
//		
//		Thread d = new Thread(new Thread2(), "DEMO THREAD");
//		d.start();
//		try {
//			for(int i=1;i<11;i++) {
//				System.out.println("JAVA");
//				Thread.sleep(5000);
//				
//			}
//		}catch(InterruptedException e) {
//			System.out.println("Main thread interrupted.");
//		}
//		
//
//		System.out.println("Main 수행종료");
//		
//		
//	}
//}
//
//

public class ThreadLab {
	public static void main(String[] args) {
		//Thread1 thread1 = new Thread1();
		//Thread2 thread2 = new Thread2();
		//Thread3 thread3 = new Thread3();
		//Thread4 thread4 = new Thread4();
		
		
	}
}

class Thread1 extends Thread {
	
}
