package lesson_14;
//синхронизированные блоки кода..

public class Main {

	static int [] m = new int [100];
	static String mon = "";		//переменная для общего пользования двум потокам
	
	public static void main(String[] args) {

		for (int i = 0; i < m.length; i++) {
			m[i]=i+1;
		}
		Thread t1 = new T1();
		Thread t2 = new T2();
		t1.start();
		t2.start();

	}

}
class T1 extends Thread {
	public void run(){
		while(true){
			int i1=(int)(Math.random()*100);
			int i2=(int)(Math.random()*100);
			
			synchronized (Main.mon) 

			{
				
			int t = Main.m[i1];
			Main.m[i1]=Main.m[i2];
			Main.m[i2]=t;
			
		}
			
		}
	}
}
class T2 extends Thread {
	public void run(){
		while (true) {
			int s = 0;
			
			synchronized (Main.mon) {
				
			for (int t : Main.m) {
				s+=t;
			}
				
			}
			
			if(s!=5050)System.out.println(s);
			
		}
	}
}
