package lesson_02;

public class ip01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		byte b = 0;
		//b = b + 0; // нельзя так делать
		
		b = (byte)(b + 0);
		System.out.println(b);
		
		short sh = 0;
		sh = (short) (sh*1);
		System.out.println(sh);
		
		char ch = 'a';
		short sh1 = (short) ch;
		System.out.println(sh1);
		
		
		// TODO Auto-generated method stub

	}

}
