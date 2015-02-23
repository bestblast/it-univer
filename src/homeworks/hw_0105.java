package homeworks;

public class hw_0105 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String s = "Java";
		String s2 = s.replace("a", "");
		System.out.println(s.length() - s2.length());
		
		int c  = "Java".length() - "Java".replace("4", "").length();
		
		System.out.println(c);
		// TODO Auto-generated method stub

	}

}
