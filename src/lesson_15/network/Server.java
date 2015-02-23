package lesson_15.network;

import java.net.*;
import java.io.*;

public class Server {

	public static void main(String[] args) throws Exception {

		ServerSocket ss = new ServerSocket(1024);
		System.out.println("Server started....");
		byte [] data = new byte[32];

		while (true) {
			Socket cs = ss.accept(); // оставновка программы до момента сингнала от клиента
			InputStream in = cs.getInputStream();
			OutputStream out = cs.getOutputStream();
			int received = 0;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			while((received = in.read(data))!=-1){
				out.write(data,0,received); // пересылка клиенту
				baos.write(data,0,received);
			}
			cs.close();

			String s = new String(baos.toByteArray());
			System.out.println("Client says: " + s);
			
			if (s.contains("END"))System.exit(0);
		}
	}
}
