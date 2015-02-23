package lesson_07;

import java.io.File;
import java.util.Arrays;

public class AnyCharCmp_test {

	public static void main(String[] args) {
		
		String [] s = new File("/home/artem/").list();
		Arrays.sort(s,new AnyCharCmp());                 // объект для сравнения строк
		for (String t : s) {
			System.out.println(t);
		}		

		
		

	}

}
