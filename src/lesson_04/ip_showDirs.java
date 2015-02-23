package lesson_04;
import java.io.File;

public class ip_showDirs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File d = new File("/home/artem/_app");
		//		showDir(d);
		//		countFiles(d,0);
		//		System.out.println(countFiles(d));
		System.out.println(maxFile(d));


	}
	static void showDir(File dir){
		//		System.out.println("");
		System.out.println(dir.getName());
		File[]fds = dir.listFiles();
		if(fds == null)
			return;
		for (File t : fds) {
			if(t.isDirectory())
				showDir(t);
		}
	}
	static void countFiles(File dir, int c){
		//		System.out.println("");
		System.out.println(dir.getName() +" : count of files: " + c);
		File[]fds = dir.listFiles();
		if(fds == null)
			return;
		for (File t : fds) {
			if(t.isFile())				
				c++;
			else if (t.isDirectory())
				countFiles(t,c); 	
		}
	}
	static int countFiles(File dir){
		int res = 0;
		System.out.println(dir.getName());
		File []fds = dir.listFiles();
		if(fds==null)
			return 0;
		for (File t : fds) {
			if(t.isDirectory())
				res+=countFiles(t);
			else if(t.isFile())
				res++;
		}
		return res;

	}
	static File maxFile(File dir){
		File max = null;
		File []fds = dir.listFiles();
		if(fds==null)
			return max;
		for (File t : fds) {
			if(t.isDirectory()){
				File mt = maxFile(t);
				if(mt!=null)
					max = (max==null)?mt:(max.length()>mt.length())?max:mt;
			}
			if (t.isFile())
				max=(max==null)?t:(max.length()>t.length())?max:t;

		}
		return max;
	}
}