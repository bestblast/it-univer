package homeworks;

public class hw_0201_plus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		swedenFlag (6);		
		swedenFlag1 (9);
		swedenFlag1 (12);
		
	}

	private static void swedenFlag1(int n) {
		int N = n;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				
				if (i >= N/3 && i < N - N/3 || j >= N/3 && j < N - N/3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}								
			}
			System.out.print("\n");		
		}
		System.out.print("===============================\n");
		
	}

	private static void swedenFlag(int n) {
		int N = n;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				
				if (i == N/2 || j == N/2 || i+1 == N/2 || j+1 == N/2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}								
			}
			System.out.print("\n");		
		}
		System.out.print("===============================\n");
		
	}

}
