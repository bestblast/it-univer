package lesson_02;
import java.util.*;

public class ip04 {
	
	public static void main(String[] args) {
		
		GregorianCalendar g1 = new GregorianCalendar();
		GregorianCalendar g2 = new GregorianCalendar(1980,0,1);
//		g1.add(Calendar.YEAR, 2000);
//		g1.set(Calendar.YEAR, 2000);
		
//		g1.clear();
//		g1.add(Calendar.HOUR, 3);
//		g1.clear(Calendar.MONTH);
		int y = g1.get(Calendar.YEAR);
		int mon = g1.get(Calendar.MONTH);
		int q = g1.getMaximum(Calendar.MONTH);
		int x = g1.getMinimum(Calendar.MONTH);
		int dom = g1.get(Calendar.DAY_OF_MONTH);
		long ms = g1.getTimeInMillis();
		Date dt = g2.getTime();
		
		System.out.println(g1);
		System.out.println("Maximum: " + q);
		System.out.println("Minimum: " + x);
		System.out.println(y);
		System.out.println(mon);
		System.out.println(dom);
		System.out.println(ms);
		System.out.println(dt);
		
//		boolean b = g1.after(g2); 	//истинно ли что один более другого
		boolean b = g1.before(g2); 	//истинно ли что один более другого
		int i = g1.compareTo(g2); // сравнение дат
		System.out.println(b);
		System.out.println(i);
		String s = g1.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.CHINESE);
		String mpl = g1.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.FRANCE);
		
//		new locale("uk");
		
		System.out.println(s);
		System.out.println(mpl);

	}

}
