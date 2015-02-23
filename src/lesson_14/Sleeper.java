package lesson_14;

class Sleeper extends Thread { // не равномерное распределение работы потоков

	public void run(){
		while (true){
			synchronized (Main.mon) {
				System.out.println("\t WAIT");
				try {
					Main.mon.wait();					// усыпление процесса
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println(e);
				} 
			}
		}
	}

	public static void main(String[] args) {
		Sleeper m1 = new Sleeper();
		AlarmClock ac = new AlarmClock();
		m1.start();
		ac.start();
	}
}
class AlarmClock extends Thread {
	public void run(){
		while (true){
			synchronized (Main.mon) {
				Main.mon.notify();
			}
			System.out.println("notify");
		}
	}
}
