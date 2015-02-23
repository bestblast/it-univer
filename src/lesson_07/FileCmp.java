package lesson_07;

import java.io.File;
import java.util.Comparator;

public class FileCmp implements Comparator{
	public int compare(Object ob1, Object ob2){
		File f1 = (File) ob1;
		File f2 = (File) ob2;
		if ((f1.length()>f2.length()))
			return 1;
			else if ((f1.length()<f2.length()))
				return -1;
				else 
					return 0;
	}

	

}
