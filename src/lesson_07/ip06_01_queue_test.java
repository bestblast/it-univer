package lesson_07;

import java.io.File;

public class ip06_01_queue_test {

	public static void main(String[] args) {
		
		String[] s = new File("/home/artem/Data/").list();
		MyQueue q = new MyQueue();
		for (String t : s) {
			q.enqueue(t);
			System.out.println(q);			
		}
		while (!q.isEmpty()) {
			q.dequeue();
			if (q.dequeue().contains("p"))
				System.out.println(q.dequeue());
			System.out.println(q);			
		}
		
		
		
		
		
		
		
		
		

	}

}
