package lesson_01;

public class ip_foreach {

	public static void main(String[] args) {
		int []m = {1,2,3,4};
		int s = 0;
		
		System.out.println("Array: ");
		for (int i : m) {
			System.out.print(i + ",");
			}
		for (int i : m) {
			s = s + i;
		}
		
		System.out.println("Summ is: " + s);
		
	}
}
