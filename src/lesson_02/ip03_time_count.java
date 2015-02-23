package lesson_02;

public class ip03_time_count {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long st = System.currentTimeMillis();
		long st1 = System.nanoTime();
		
		for (int i = 0; i < 1000000000; i++) {
			long x = 832743243;
			x = x/2;
			//x = x >> 1;
		}
		
		long fin = System.currentTimeMillis();
		long fin1 = System.nanoTime();
		
		System.out.println(fin - st);
		System.out.println(fin1 - st1);

		long st11 = System.currentTimeMillis();
		long st12 = System.nanoTime();
		
		for (int i = 0; i < 1000000000; i++) {
			int x = 5;
			x = x/2;
			//x = x >> 1;
		}
		
		long fin11 = System.currentTimeMillis();
		long fin12 = System.nanoTime();
		
		System.out.println(fin11 - st11);
		System.out.println(fin12 - st12);

		
		// TODO Auto-generated method stub

	}

}
