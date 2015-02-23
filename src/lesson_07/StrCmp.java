package lesson_07;

import java.util.Comparator;

public class StrCmp implements Comparator{
	
	public int compare(Object ob1,Object ob2){
		String s1 = (String) ob1;
		String s2 = (String) ob2;
		return s1.length() - s2.length();
		/*
		 * >0	s1 > s2
		 * <0 	s1 < s2
		 * =0 	s1 == s2
		 */
	}
	

}
