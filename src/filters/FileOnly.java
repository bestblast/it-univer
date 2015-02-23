package filters;

import java.io.File;

public class FileOnly implements java.io.FileFilter {
	public boolean accept(File f){
		return f.isFile();
	}
}
