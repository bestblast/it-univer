package lesson_15.network;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.sql.Date;
import java.util.Scanner;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{

		
		String msg = "Hello!";

		Scanner sc = new Scanner(System.in);
		while (true) {
			Socket cs = new Socket("127.0.0.1",1024);
			System.out.println("Enter message to server: ");
			msg = sc.nextLine();
			byte [] data = msg.getBytes();
			InputStream in = cs.getInputStream();
			OutputStream out = cs.getOutputStream();

			out.write(data); // отправка сообщения
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			int total = 0, rec = 0;
			while (total < data.length) {
				rec = in.read(data,total,data.length-total);
				if(rec==-1){
					System.out.println("lost connection");
					System.exit(0);
				}
				total += rec;
				baos.write(data);
				String s = new String(baos.toByteArray());
				cs.close();
				System.out.println("data from server: " + s);
				if(s.contains("END"))System.exit(0);

			}
		}



	}
}
