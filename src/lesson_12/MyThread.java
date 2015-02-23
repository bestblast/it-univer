package lesson_12;

public class MyThread extends Thread {
	private Win2 tr;
	
	public MyThread(Win2 tr){
		this.tr=tr;
		
	}
	
	public void run(){
//			for(int i = 1;i<1e5;i++){
			for(int i = 1;i<1000;i++){
				tr.setTitle("i" + i);
//				System.out.println("i = " + i);
			}

			
		}
	}

	


