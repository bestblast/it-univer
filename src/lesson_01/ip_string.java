package lesson_01;

public class ip_string {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "Java";
		char []mc = s.toCharArray();
		int c = 0;
		for (char t : mc) {
			if (t=='a')
				c++;
			
		}
		System.out.println(c);
		
		//s.charAt() - 
		
		System.out.println(mc.length);
		System.out.println(s.length());
		
	}

}
