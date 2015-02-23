package lesson_09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class it_test {

	public static void main(String[] args) {
		
		ArrayList<String> arl = new ArrayList<>();
		String [] ps = {"Washington","Bush","Adams","Klinton","Monroe","Kennady"};
		for (String t : ps) {
			arl.add(t);
			
		}
		System.out.println(arl);
				
		Iterator<String> it = arl.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
			it.remove();
		}
		LinkedList<String> ll = new LinkedList<>();
		for (String string : ps) {
			ll.addLast(string);
		}
		Iterator<String> li = ll.iterator();
		while(li.hasNext()){
			System.out.println(li.next());
		}

	}

}
