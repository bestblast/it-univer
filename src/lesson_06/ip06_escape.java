package lesson_06;

public class ip06_escape {

	/**
	 * \n - новая строка	10
	 * \r - новая строка	13
	 * \t - Табуляция		9
	 * \b - backspace		8
	 * \f - новая страница	12
	 * \\ - Экранирование	
	 * \" - Экранирование "	34
	 * \' - Экранирование '	39
	 */
	public static void main(String[] args) {
		System.out.println("one step\ntwo step" + (char)39 + "third");
		System.out.println("Java\t1995\nPascal\t1971\nC++\t1983\n1234567\t1900\n12345678\t1901\b\f");
		System.out.println("C:\\tmp\\b.txt");
		System.out.println("\"C:\\tmp\\b.txt\"");
		char c = '\'';
		System.out.println(c);
		
		

	}

}
