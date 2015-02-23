package lesson_14;
// 

public class Main3 {

	static int [] m = new int [100];
	static String mon = "";		//переменная для общего пользования двумя потокам
	
	public static void main(String[] args) {

		for (int i = 0; i < m.length; i++) {
			m[i]=i+1;
		}
//		Main3 m = new Main3();      // блок, в котором синхронизация выполняется. (один и тотже объект)
//		Thread t1 = new T5(m,false);
//		Thread t2 = new T5(m,true);
//		t1.start();
//		t2.start();
		
		Main3 m1 = new Main3(); // блок, в котором синхронизация не выполняется. (разный объект)
		Main3 m2 = new Main3();
		Thread t1 = new T5(m1,false);
		Thread t2 = new T5(m2,true);
		t1.start();
		t2.start();

	}
	synchronized void sum(){ // относятся к экземплярам класса
		int s = 0;
		for (int t : m) {
			s+=t;
		}
		if (s!=5050)
			System.out.println(s);
	}
	synchronized void swap(){ // синхронизированный метод
		int i1 = (int)(Math.random()*100);
		int i2 = (int)(Math.random()*100);
		int t = m[i1];
		m[i1] = m[i2];
		m[i2]= t;
		
	}

}
//class T3 extends Thread {
//	public void run(){
//		while (true) {
//			Main2.sum();
//		}
//	}
//}
//class T4 extends Thread {
//	public void run(){
//		while (true) {
//			Main2.swap();
//		}
//	}
//}
class T5 extends Thread {
	private Main3 main;
	private boolean sum;
	public T5(Main3 m, boolean s){
		main = m;
		sum = s;
	}
	public void run(){
		while (true) {
			if(sum)	main.sum();
			else main.swap();			
		}
	}
}



