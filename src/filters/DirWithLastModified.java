package filters;

import java.io.File;
import java.util.GregorianCalendar;

public class DirWithLastModified implements java.io.FileFilter{// отбираем директории с датой создания в заданом диапазоне

	private GregorianCalendar d1,d2;
	public DirWithLastModified(GregorianCalendar d1,GregorianCalendar d2) {
		this.d1 = d1;
		this.d2 = d2;
	}
	public boolean accept(File f) {
//		return f.isDirectory() && f.lastModified() > new GregorianCalendar(2014, 6, 14).getTimeInMillis() ;
		return f.isDirectory() && f.lastModified() > d1.getTimeInMillis() && f.lastModified() <= d2.getTimeInMillis() ;
	}
	

}
