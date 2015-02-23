package lesson_04;
import java.util.GregorianCalendar;
import java.util.Locale;


public class ip_stringFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = String.format("%.4f", Math.PI);
		System.out.println(s);		
		System.out.println(String.format("%d %o %X", 95,95,95)); //вывод числа в разных системах исчесления
		System.out.println(String.format("%c:%C:%d", 97,97,97)); //вывод символа от его номера
		System.out.println(String.format("%s:%S", "Java","Java")); //вывод числа в разных системах исчесления
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(String.format("Current Time: %tH:%tM:%tS", gc,gc,gc));
		System.out.println(String.format("Current Date: %tY:%tm:%td", gc,gc,gc));
		System.out.println(String.format(Locale.ENGLISH,"wday: %tA wday: %ta mon:%tB", gc,gc,gc));
		/*
		 * %[#params$][flags][ширина][.точность]преобразование
		 */
		String[]m={"Java","C#","Pascal"};
		for (String t : m) {
			System.out.println(String.format("%10S", t));
			
		}
		for (int i = -3; i < 3; i++) {
			System.out.println(String.format("%05d", i));
		}
		for (int i = -3; i < 3; i++) {
			System.out.println(String.format("%(5d", i));
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(String.format("%2d %10.2f", i,Math.pow(i, 0.5)));
		}


	}

}
