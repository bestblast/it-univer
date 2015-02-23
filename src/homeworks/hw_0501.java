package homeworks;

public class hw_0501 {

	/**
	 * выводим все цифры с конца числа
	 * 
	 */
	public static void main(String[] args) {
		
		int a = 1234;
		
		System.out.println(a);		
		printAllDigits(a);
			
		}

	static void printAllDigits(int a){
		int x = 10;
//		System.out.println(a + " " + a + " x=" + x);
		System.out.println(a%x);
		a=a/x;
		if(a==0)
			return;
		
		printAllDigits(a);

		}

}
