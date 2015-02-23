package homeworks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class hw_0502_MyArray {

	public static void main(String[] args) throws IOException {
		int[]ar1 = {1,2,3};
		int[]ar2 = {4,5,6};
		//		Path filename = "/tmp/array_out";
		MyArray newArr = new MyArray(ar1);
		newArr.print();		

		newArr.add(8);
		newArr.print();

		newArr.add(ar2);
		newArr.print();
		
		newArr.remove(3);
		newArr.set(3, 500);
		newArr.print();

		String filename = "/tmp/arrayout";
		newArr.writeToFile(filename);

	}
}

class MyArray {
	private ArrayList<Integer> x = new ArrayList<>();
	private BufferedWriter bw;

	public MyArray (int[]a){
		for (int i : a)
			x.add(i);
	}

	public void add(int a){
		x.add(a);
	}
	public void add(int []m){
		for (int i : m) {
			x.add(i);
		}

	}
	public int get(int index){
		return x.get(index);
	}
	public void set(int index, int value){
		x.set(index, value);
	}
	public int lenght(){
		return x.size();

	} 
	public void remove(int index){
		x.remove(index);
	}
	public String print(){
//		String s;
		for (Integer t : x) {
			System.out.print("[" + t + "]");

		}
		System.out.println(" : Total element(s): " + this.lenght());
		return x.toString();

	}
	public void writeToFile(String filename) throws IOException{
		FileWriter fw = new FileWriter(filename);
		bw = new BufferedWriter(fw);
		bw.write(x.toString());
		bw.newLine();
		bw.close();
	}
//	public int[] toArray(){
//		return x.toArray();
//	}
}
