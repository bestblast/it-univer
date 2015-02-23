package lesson_14;

public class generic_type {
	
	static <T> T repeat(T t){
		return t;
	}
	static Object repeatOb(Object o){
		return o;
	}
	
	public static void main(String[] args) {
		
		String s = repeat("ABC");
		int x = repeat(5);
//		double d = repeat("ABC");		//compile-time error
//		double d2 = repeatOb("abc");	//runtime error
	}

}
