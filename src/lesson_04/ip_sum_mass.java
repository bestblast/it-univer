package lesson_04;

public class ip_sum_mass {

	/**
	 * сумма элементов массива. 
	 */
	public static void main(String[] args) {

		System.out.println(sum(new int[]{1,2,3,43,5},0));

	}

	static int sum(int[] mas,int i){
		if (i>=mas.length)
			return 0;
		else 
			return mas[i] + sum(mas,i+1);
	};

}
