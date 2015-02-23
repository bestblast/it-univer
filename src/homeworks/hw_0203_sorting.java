package homeworks;

public class hw_0203_sorting {

	public static void main(String[] args) {

		int []a = {98,345,21,234,1234,242,546567,32432,324323,32,3246,54654,32254};


		bucketsort(a);

	}

	private static void bucketsort(int [] a) {
		int min = a[1];
		int max = a[1];
		int n = 0;
		for (int i : a) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}

			n++;
		}
		int diff = max - min;
		for (int i = 0; i < diff; i++) {

		}
		System.out.println("Number of elements: " + a.length);
		System.out.println("MIN element: " + min);
		System.out.println("MAX element: " + max);	

		System.out.println("Count of operations: " + n);

		System.out.println(diff);
	}

}
