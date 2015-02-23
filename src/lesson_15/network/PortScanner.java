package lesson_15.network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class PortScanner {

	public static void main(String[] args) throws Exception {
		String dest = "10.0.0.217";
//		if (args[0].matches("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
//		        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
//		        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
//		        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"))
//			dest = args[0];
		if(args[0].matches("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"))
				dest=args[0];
		System.out.println("Dest: " + dest + " Try scan port: ");
		for (int p = 0; p < 65534; p++) {
			try {
				System.out.print(p);
				new Socket(dest,p);
				System.out.println("\nport: " + p);
			} catch (UnknownHostException e) {
//				e.printStackTrace();
			} catch (IOException e) {
//								e.printStackTrace();
			}
						System.out.print("\r");
//			System.out.print("\b\b\b\b");
//			Thread.sleep(1);
		}
	}
}
