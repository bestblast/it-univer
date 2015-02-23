package lesson_02;

public class ip02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int []m = new int[5];
		for (int i = 0; i < m.length; i++) {
			double d = Math.random() * 11;
			int x = (int) d;
			m[i] = x;			
			System.out.println(m[i]);
		}
		//System.out.println(m[].toString());				
		// TODO Auto-generated method stub
	}

}
