package lesson_01;

public class ip_year {

	public static void main(String[] args) {
		
		int y = 1911;
		
		boolean res_opt=(y%400==0)?true:(y%100==0)?false:(y%4==0); 
		//троичный оператор
		//case		
		
		boolean result;
		//String result;
		
		if (y%400==0) {
			result = true;
		} else if (y%100==0) {
			result = false;
		} else if (y%4==0) {
			result = true;
		} else {
			result = false;
		}
		System.out.println("metod 1: " + result);
		System.out.println("metod 2: " + res_opt);
		
	}
}
