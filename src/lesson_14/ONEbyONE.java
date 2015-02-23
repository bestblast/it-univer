package lesson_14;

public class ONEbyONE {
	static int x;
	static final String mon = ""; 	//адрес не изменный ссылку нельзя присвоить новую
	static boolean done;			// default value FALSE



	public static void main(String[] args) {

		Thread t1 = new One();
		Thread t2 = new Two();
		t1.start();
		t2.start();
	}
}

class One extends Thread{
	public void run(){
		int c=0;
		while(true){
			synchronized (ONEbyONE.mon) {
				while (ONEbyONE.done==false) {
					try {
						ONEbyONE.mon.wait();
					} catch (Exception e) {
						System.out.println(e);;
					}}
				
					System.out.println("ONE" + c++);
					for (int i = 2; i < ONEbyONE.x/2; i++) {
						if(ONEbyONE.x%i==0)
							System.out.println(i+"TRUE");
						
					}
					ONEbyONE.done=false;
					ONEbyONE.mon.notify();
					
				
			}
		}
	}
}
class Two extends Thread{
	public void run(){
		int c=0;
		while(true){
			synchronized (ONEbyONE.mon) {
				while (ONEbyONE.done==true) {
					try {
						ONEbyONE.mon.wait();
					} catch (Exception e) {
						System.out.println(e);;
					}
				}
					System.out.println("\tTWO" + c++);

					ONEbyONE.x = (int)(Math.random()*1000);

					ONEbyONE.done=true;
					ONEbyONE.mon.notify();
					
				
			}
		}
	}
}