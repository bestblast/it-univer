package homeworks;
public class hw_0104 {

	public static void main(String[] args) {
		int N = 9;
		
		for (int i = 0; i < N; i++) {
			//System.out.println();
			for (int j = 0; j < N; j++) {
				if (i%2 == 0 && j%2==0)
				System.out.print("*");
				else System.out.print(" ");
				
			}
			System.out.println();
			
		}
		
		
	}

}
