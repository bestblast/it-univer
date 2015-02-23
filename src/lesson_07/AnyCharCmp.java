package lesson_07;

import java.util.Comparator;

public class AnyCharCmp implements Comparator{
	private char C = 'D';
	public int compare(Object ob1, Object ob2){
		int c1 = 0;
		int c2 = 0;
		String s1 = (String) ob1;
		String s2 = (String) ob2;
		for (char t : s1.toCharArray()) {
			if (t == C)
				c1++;			
		}
		for (char t : s2.toCharArray()) {
			if (t == C)
				c2++;			
		}

		if (c1>c2)
			return 1;
		else if (c1<c2)
			return -1;
		else return 0;
		
		
		
	}
	
	

}
