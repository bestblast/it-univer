package lesson_04;

public class ip_0401 {

	public static void main(String[] args) {

		print (10);
		print (10,1);
	}
	static void print(int n){
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	static void print(int n, int i){
		System.out.print("*");
		if (i<n)
			print(n,i+1);
		else
			System.out.println();		
	}
}
