package lesson_15;

import static java.lang.System.out;

public class testByte {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		out.println();
		
		Byte b1 = new Byte("1");
		Byte b2 = new Byte("1");
		System.out.println(b1==b2);
		
		Byte b3 = 1;
		Byte b4 = 1;
		System.out.println(b3==b4);
		
		Byte b5 = (byte) 128;
		Byte b6 = (byte) 128;
		System.out.println(b5==b6);
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		System.out.println(i1==i2);
		
	}

}
