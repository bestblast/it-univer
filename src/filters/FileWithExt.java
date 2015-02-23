package filters;

import java.io.File;

public class FileWithExt extends FileOnly {
	private String ext;
	public FileWithExt(String ext){
		this.ext = ext;
	}
	
	
		public boolean accept(File f){
			return f.getName().endsWith(ext);
		}
	

}
