package lesson_15;

import java.util.*;

public class SynkList {
		
	static <T> List <T> pack(T ... args) {
		ArrayList<T> ar = new ArrayList<T>();
		for (T t : args) {
			ar.add(t);
		}
		return ar;
		
	}

	public static void main(String[] args) {
		
		List<Integer> li = pack(1,2,3);
//		List<Number> ln = pack(2,3.5); // error
		List<Number> lnr = SynkList.<Number>pack(2,3.5); // No error
		
		List<?extends Number> ln2 = pack(2,3.5);
		
		ln2.add(null);

		Object [] ob = new String[3];
//		ob[1] = 1;
		
		List<?extends Number> ln3;
		ln3 = new ArrayList<Integer>();
		ln3 = new ArrayList<Byte>();
		ln3 = new ArrayList<Double>();
		
		
		
		////
		
		List<Number> lst = l3; //
		List<? extends Number> l4 = l3;// 
		

	}

}
