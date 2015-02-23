package lesson_01;
import java.util.Arrays;

public class ip_string_find {


	public static void main(String[] args) {
		
		String s = "to be or not to be";
		String []words = s.split(" ");
		
		System.out.println(Arrays.toString(words));
		String s2 = "Ada 1983";
		int c = 0;
		char []m2 = s2.toCharArray();
		for (char t : m2) {
			//if (t >= '0' && t <= '9') //проверка символов (число или нет)
			if (Character.isDigit(t))	//проверка символов (число или нет)		
				c++;
		};
		
		System.out.println(c);	

	}

}
