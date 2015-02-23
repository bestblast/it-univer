package lesson_01;
import java.util.*;

public class ip_scanner {	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x:");
		String s = sc.nextLine();
		int x = Integer.parseInt(s);	
		System.out.println("Your input: " + x);
		
		boolean result = false;
		
		for (int i=2; i<=x/2; i++){
			if (x%i==0) {
				result = false;
				break;
				}
		}
		System.out.println(x + " is prime");				
	}
}
