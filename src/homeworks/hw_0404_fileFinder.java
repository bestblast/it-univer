package homeworks;

import java.io.File;

public class hw_0404_fileFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File d = new File("/home/artem/_app");
		findFiles(d,0);
		// TODO Auto-generated method stub

	}

	static void findFiles(File dir, int c) {
		//		System.out.println("");
		System.out.println("\nFolder: " + dir.getName() +" : count of files: " + c);
		File[]fds = dir.listFiles();
		if(fds == null)
			return;
		for (File t : fds) {
			if(t.isFile())
			{
			c++;}
			else if (t.isDirectory())
				findFiles(t,c); 	
		}
	}


}
