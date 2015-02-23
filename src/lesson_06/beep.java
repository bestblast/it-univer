package lesson_06;

import java.awt.Toolkit;

public class beep {

	public static void main(String[] args) {
		char c = (char)7;
		System.out.println(c);
		System.out.print("\0007");
		System.out.flush();
		Toolkit.getDefaultToolkit().beep();
		System.out.print("\007");
	}

}
