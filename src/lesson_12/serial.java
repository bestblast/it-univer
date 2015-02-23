package lesson_12;

import java.io.*;

public class serial {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("/home/artem/j.bin"); // пишет по одному байту
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject("\n\rJava\n\r");

			oos.writeBoolean(true);
			oos.writeDouble(Math.PI);
			oos.writeInt(77);
			oos.writeObject("Java\n");
			Sotr sotr = new Sotr("Max", new int[]{1,2});
			oos.writeObject(sotr);
			
			oos.close();
			
			FileInputStream fis = new FileInputStream("/home/artem/j.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);
						System.out.println(ois.readObject());
System.out.println(ois.readBoolean());
			System.out.println(ois.readDouble());
			System.out.println(ois.readInt());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			
		} catch(Exception e){
			System.out.println(e);
		}
	}
}
