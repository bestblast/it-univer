package lesson_09;

import java.util.Iterator;

public class SimpleIter implements Iterator<Integer>,Iterable<Integer>{

	private int []m = {1,2,3,4,5};
	private int index;
	public boolean hasNext(){return index<m.length;} 	//
	public Integer next() {return m[index++];}			//
	public void remove(){ /* */ };						//	
	public Iterator<Integer> iterator(){index = 0; return this;}

	public static void main(String[] args) {

		SimpleIter si = new SimpleIter();
		Iterator<Integer> iti = si.iterator();

		while(iti.hasNext())
			System.out.println(iti.next());

		iti = si.iterator();
		while(iti.hasNext())
			System.out.println(iti.next());	
		
		for (int t : si) {
			System.out.println(t);
		}

	}

}
