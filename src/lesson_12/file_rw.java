package lesson_12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class file_rw {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("/home/artem/j.bin");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
			System.out.println("test scanner");
//			Scanner sc = new Scanner(new File("/home/artem/infopulse/it-univer/src/lesson_12/file_rw.java"));
			Scanner sc = new Scanner(new File("/home/artem/j.bin"));
			
			while (sc.hasNextLine()) {
				
				String line2 = sc.nextLine();
				System.out.println(line2);
				
			}
			sc.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
