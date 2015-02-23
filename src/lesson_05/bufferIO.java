package lesson_05;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class bufferIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		try {
			String path = "/tmp/tempfile";
			FileWriter fw = new FileWriter(path,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hello!!");
			bw.newLine();
			bw.write("Second line");bw.newLine();
			bw.close();
			
			Runtime.getRuntime().exec(new String[]{"gedit",path});
			
			
		} catch(Exception e){
			System.out.println("Errror: "+e);}
		

	}

}
