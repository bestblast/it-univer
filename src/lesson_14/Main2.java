package lesson_14;
// синхронизированные методы..

public class Main2 {

	static int [] m = new int [100];
	static String mon = "";		//переменная для общего пользования двумя потокам
	
	public static void main(String[] args) {

		for (int i = 0; i < m.length; i++) {
			m[i]=i+1;
		}
		Thread t1 = new T3();
		Thread t2 = new T4();
		t1.start();
		t2.start();

	}
	static synchronized void sum(){ // синхронизированный метод
		int s = 0;
		for (int t : m) {
			s+=t;
		}
		if (s!=5050)
			System.out.println(s);
	}
	static synchronized	void swap(){ // синхронизированный метод
		int i1 = (int)(Math.random()*100);
		int i2 = (int)(Math.random()*100);
		int t = m[i1];
		m[i1] = m[i2];
		m[i2]= t;
		
	}

}
class T3 extends Thread {
	public void run(){
		while (true) {
			Main2.sum();
		}
	}
}
class T4 extends Thread {
	public void run(){
		while (true) {
			Main2.swap();
		}
	}

	
}


