package lesson_13;

import java.util.HashMap;

public class SPoint {
	
	private int x,y;
	public SPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "x=" + x + ";y=" + y; 
	}
	public int hashCode(){
		return x + y;
	}
	public boolean equals(Object ob){
		if(ob==this)
			return true;
		if(ob==null)
			return false;
		if(ob instanceof SPoint == false)
			return false;
		SPoint o = (SPoint)ob;
		return this.x==o.x && this.y==o.y;
		
	}

	public static void main(String[] args) {
		HashMap<SPoint, String> hm2 = new HashMap<>();
		hm2.put(new SPoint(1, 1), "a");
		hm2.put(new SPoint(1, 2), "b");
		hm2.put(new SPoint(1, 1), "a2");
		hm2.put(new SPoint(2, 1), "21");
		
		System.out.println(hm2);
	}
}
