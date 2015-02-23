package lesson_14;

import java.util.ArrayList;

public class test_generic {

	public static void main(String[] args) {
		
		ArrayList<String> arl = new ArrayList<>();
		ArrayList<Integer> ai = new ArrayList<>();
		arl.add("Hello");
//		arl.add(1); ERROR => arl.add((String)1);
		System.out.println(arl.getClass()==ai.getClass());
		
		ArrayList old = arl;  // raw type
		old.add(55);
		for (Object t : old) {
			System.out.println(t.getClass().getName());
		}
	}
}
