package lesson_02;
import java.io.*;
import java.util.GregorianCalendar;

public class ip05_file {
	
	
	public static void main(String[] args) {
		
		File dir = new File("/home/artem/");
		boolean ex = dir.exists();
		System.out.println("Is dir exists? : " + ex); //
		System.out.println("Directory? : " + dir.isDirectory());
//////////////list of files//////////////
		String []fls = dir.list();
		for (String t : fls) {
			if (t.toLowerCase().endsWith("png")) {
				System.out.println(t + " len = " + t.length());
			} 
		}
//////////////list of files with size//////////////		
		File []fls1 = dir.listFiles();
		for (File t : fls1) {
			if (t.getName().toLowerCase().endsWith("png")) {
				GregorianCalendar dt = new GregorianCalendar();
				dt.setTimeInMillis(t.lastModified());
				System.out.println("Name: " + t.getName() + "\nlen: " + t.length() + "\nDate: " +  t.lastModified() + "\nDate: " + dt.getTime());
			} 
		}
		int c = 0;
		for (File t : fls1) {
			char []temp = t.getName().toCharArray();
			for (char u : temp) {				
				if (Character.isDigit(u))	//проверка символов (число или нет)		
				{	
				c++;
				if (c==2)
				System.out.println("Name: " + t.getName());
				}
			};

			
			
		}
		

		
	}
}
