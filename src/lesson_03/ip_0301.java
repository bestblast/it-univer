package lesson_03;
import java.lang.reflect.Array;
import java.util.Arrays;


public class ip_0301 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] ar = new int[5];
		fill(25,ar);
		coutOfEven(1,2,3,4,5,6,7,8,9);
		sum(2,5);
		sum("qwe","rty");
//		sum({1,2,3},{4,5,6});
		


		// TODO Auto-generated method stub

	}
	static  void fill(int val, int[]ar) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] = val;			
		}
		System.out.println(Arrays.toString(ar));

	}
	static   int coutOfEven(int ... params){
		int j = 0;
		for (int i : params) {
			if (i%2 == 0)
				j++;			
		}
		System.out.println(j);
		return j;

	}
	static int sum(int a, int b){//для суммирования целых
		return (a+b);
	} 

	static int[] sum(int[]a, int[]b){//для суммирования данных массивов
		int[] res = new int[a.length+b.length];
		
		return res;

	}
	static String sum(String a, String b){//для склейки строк		
		return a+b;
		

	} 

}
