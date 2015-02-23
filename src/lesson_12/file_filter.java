package lesson_12;

import java.io.File;
import java.util.GregorianCalendar;

import filters.DirWithLastModified;
import filters.FileOnly;
import filters.FileWithExt;

public class file_filter {

	public static void main(String[] args) {
		File dir = new  File("/home/artem/");
		File[] files = dir.listFiles(new FileOnly());
		File[] files2 = dir.listFiles(new FileWithExt(".txt"));
		File[] files3 = dir.listFiles(new DirWithLastModified(new GregorianCalendar(2014, 5, 2),new GregorianCalendar(2015, 4, 4)));
		
//		for (File t : files) {
//			System.out.println(t.getName() + " is file: " + t.isFile());
//		}
		for (File t : files2) {
			System.out.println(t.getName() + " is file: " + t.isFile());
		}
//		for (File t : files3) {
//			System.out.println(t.getName() + " is file: " + t.isFile());
//		}
	}
}
