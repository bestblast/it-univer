package lesson_01;

public class ip_string_buffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.length());
		
		sb.append("Pascal");
		sb.insert(0, "C#");
		sb.append("1970");
		System.out.println(sb.length());
		sb.append(Math.PI);
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println(sb.reverse());		
		
		String a  = "test";		
		a = a + "text 1";
		System.out.println(a);
	}
}
