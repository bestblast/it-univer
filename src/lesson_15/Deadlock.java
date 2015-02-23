package lesson_15;

public class Deadlock { //блокировка 
	static Test a,b;
	static String mon = "";

	public static void main(String[] args) {
		//БЛОК1

		//		a = new Test("A", null);
		//		b = new Test("B", a);
		//		a.setAnother(b);
		//		new T1().start();
		//		try {
		//			Thread.sleep(100);
		//		} catch (InterruptedException e) {
		//			e.printStackTrace();
		//		}
		//		new T2().start();
		//БЛОК1


		//БЛОК2
		new T3().start();
		new T4().start();
		//БЛОК2


	}

}

class Test {
	private String name;
	private Test another;
	public Test(String n, Test a){
		name = n;
		another = a;
	}
	public void setAnother(Test a){
		another = a;
	}
	public synchronized void ask(){
		System.out.println(name + " ask " + another.getName());
		another.answer();

	}
	public synchronized void answer() {
		System.out.println(name + " answer " + another.getName());
	}
	private String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
class T1 extends Thread {
	public void run (){
		Deadlock.a.ask();
	}
}
class T2 extends Thread {
	public void run(){
		Deadlock.b.ask();
	}
}
class T3 extends Thread {
	public void run(){
		while (true) {
			synchronized (Deadlock.mon) {
				System.out.println("A");
				try {
					Deadlock.mon.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Deadlock.mon.notify();

			}
		}

	}
}
class T4 extends Thread {
	public void run(){
		while (true) {
			synchronized (Deadlock.mon) {
				System.out.println("B");
				Deadlock.mon.notify();
				try {
					Deadlock.mon.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}


			}
		}
	}
}