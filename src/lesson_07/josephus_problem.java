package lesson_07;

public class josephus_problem {

	public static void main(String[] args) {
		String [] s = {"1","2","3","4","5","6","7","8","9","10","11"};
		MyQueue q = new MyQueue();
		for (String t : s) {
			q.enqueue(t);
					
		}
		System.out.println(q);	
		josephus(q, 3);
		

	}
	public static void josephus (MyQueue q, final int k){

		while (q.size()>1){
			for (int i = 1; i < k; i++) {
				q.enqueue(q.dequeue()); //удаление к-го элемента
			}
			q.dequeue();			
		}
		String win = q.dequeue();
		System.out.println(win);
		q.enqueue(win);
	}

}
