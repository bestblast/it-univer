package lesson_01;
import java.util.Scanner;

public class ip_passscan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String pwd;
		
		do {
			System.out.println("Enter Password: ");
			pwd = sc.nextLine();
		}
		while (pwd.equals("abc")==false);
		System.out.println("Password is correct!");
		
		System.out.println("Bye!");

	}

}
