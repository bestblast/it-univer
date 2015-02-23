package homeworks;

public class hw_0103_quare {

	public static void main(String[] args) {
		int N = 10;
		
		for (int i = 0; i < N; i++) {
			//System.out.println();
			for (int j = 0; j < N; j++) {
				if (j == 0 || i == 0 || j == N-1 || i == N-1) {
					System.out.print("("+ i + "," + j + ")");
					System.out.print("*");
				}
				
				else {
					System.out.print("("+ i + "," + j + ")");
					System.out.print(" ");
				} 
									
			}
			System.out.println();			
		}		
	}
}
