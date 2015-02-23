package lesson_14;

import java.util.concurrent.atomic.*; // тип данных для синхронизированныч методов

public class Atomic {
	
	static AtomicInteger x = new AtomicInteger(); // синхронизированный метод
//	static int x = new AtomicInteger();
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new TA()); // передача интерфейса раннабл
		Thread t2 = new Thread(new TA());
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch(Exception e) {}
		System.out.println("x = " + x);


	}

}

class TA implements Runnable {
	static String mon = ""; // переменная для синхронизации
	public void run (){
		for (int i = 1; i <= 5000; i++) {
			Atomic.x.incrementAndGet();
//			synchronized (mon) {// блок для синхронизации
			

//				Atomic.x++;
				
//			}
			
		}
	};
}