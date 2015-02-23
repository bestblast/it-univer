package lesson_07;

import java.io.File;
import java.util.Arrays;

public class ip07_file_cmp_test {

	public static void main(String[] args) {
		
		File [] s = new File("/home/artem/").listFiles();
		Arrays.sort(s,new FileCmp());                 // объект для сравнения строк
		for (File t : s) {
			System.out.println(t + " size : " + t.length() );
		}		


	}

}
