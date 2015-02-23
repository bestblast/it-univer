package lesson_15;

import java.util.Arrays;

public class noGeneric {
	static void sort (Object [] ar){
		Arrays.sort(ar);
	}
	static <T extends Number&Comparable> void sort2(T [] ar){
		Arrays.sort(ar);
	}

	public static void main(String[] args) {
		
		StringBuffer sm[] = {new StringBuffer("A"), new StringBuffer("B")};
//		sort(sm);
		Integer[]ia = {11,2,4};
		Double []da	= {3d,2.};
		sort2(ia);
		sort2(da);
		MyNumber []ma = {new MyNumber()};
		sort(ma);
		
	}

}

class MyNumber extends Number {
	public int intValue() {
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
