package lesson_12;

import java.util.Arrays;

public class Sotr implements java.io.Serializable{ //позволяет сериализовывать
	
	private String name;
	private transient int[]s;
	public Sotr(String n, int[] s){
		name = n;
		this.s = s;
	}
	public String toString(){
		return "name=" + name + "\ns=" + Arrays.toString(s);
	}
}
