package lesson_06;

import java.util.Stack;

public class ip05_stack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length() + " " + sb.capacity());
		Stack st = new Stack();
		System.out.println(st);
		st.push("Assembler");
		st.push("Basic");
		st.push("Fortran");
		st.push("Pascal");
		st.push("Java");
		System.out.println(st);
		System.out.println(st.peek());
		while (st.empty()==false) {
			System.out.println(st.pop());
			
		}
		
		Stack<Integer> si = new Stack<>();
		si.push(33);
		si.push(11);
		si.push(22);
		System.out.println(sum(si));

		
	}
	
	static int sum(Stack<Integer> si){
		
		if (si.empty())
			return 0;
		else 
			return si.pop() + sum(si);
		
		
		
	}
	

}
