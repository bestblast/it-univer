package lesson_15;

public class Deadlock1_TestDrive {
	static Test a,b;
	static String mon = "";


	public static void main(String[] args) {

		a = new Test("A", null);
		b = new Test("B", a);
		a.setAnother(b);
		new T1().start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new T2().start();
	}
}
