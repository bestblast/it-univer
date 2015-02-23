package lesson_15;

import java.util.*;

public class sum_test {
	
	static <T extends Number> double sum(List<T> lst){
		double sum = 0;
		for (T t : lst) {
			sum +=t.doubleValue();
		}
		return sum;
	}
	static <T extends Number> double sum2(List<Number> lst){
		double sum = 0;
		for (Number t : lst) {
			sum +=t.doubleValue();
		}
		return sum;
	}


	public static void main(String[] args) {
		
		ArrayList <Integer> l1 = new ArrayList<Integer>();
		ArrayList<Double> l2 = new ArrayList<Double>();
		l1.add(1);
		l1.add(2);
		l2.add(Math.PI);
		l2.add(Math.E);
		System.out.println(sum(l1));
		System.out.println(sum(l2));
		
		System.out.println(sum2(l1));
		System.out.println(sum2(l2));
		
	
		
	}

}
