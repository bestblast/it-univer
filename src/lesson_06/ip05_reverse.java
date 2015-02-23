package lesson_06;

import java.util.Stack;

public class ip05_reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] mm = {1,2,3};
		reverse(mm);
		System.out.println(mm.toString());
	}
	
	static void reverse(int[]m){
		Stack<Integer> s = new Stack<>();
		for (Integer i : m) {
			s.push(i);
		}
		for (int i = 0; i < m.length; i++) {
			m[i] = s.pop();
		}
		
	}

}
