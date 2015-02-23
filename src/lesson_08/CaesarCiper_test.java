package lesson_08;

public class CaesarCiper_test {

	public static void main(String[] args) {
		
//		String msg = "привет, как дела? ";
		String msg = "hello";
//		CaesarCiper cc = new CaesarCiper(23,' ','я');
		CaesarCiper cc = new CaesarCiper(23);
		String enc = cc.encode(msg);
		String dec = cc.decode(enc);
		System.out.println(enc + " " + dec);

	}

}
