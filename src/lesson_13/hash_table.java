package lesson_13;

import java.util.*;

public class hash_table {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		hm.put("Italy", 4);
		hm.put("Brazil", 1);
		hm.put("Brazil", 5);
		
		System.out.println(hm);
		
		// function from ALL Objects
		hm.hashCode(); // int
		hm.toString(); // String
		hm.equals(hm); // bool
		hm.getClass(); // class description
		
		hm.notify();	// synchronize block. 
		hm.notifyAll();	// synchronize block. 
		//hm.wait();		// synchronize block. 
		
		hm.clone();		// Object    protected 
		//hm.finalize(); //          protected 
	}
}
