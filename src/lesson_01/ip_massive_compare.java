package lesson_01;
import java.util.Arrays;
import java.sql.*;

public class ip_massive_compare {
	
	public static void main(String[] args) {
		
		
		
		int []a = {1,2,3,4,5,6,7,8,9};
		int []b = {1,2,3,4,5,6,7,8,4};
		//System.out.println(Arrays.equals(a, b));
		
		boolean res = a.length==b.length;
		System.out.println(res);
		if (res = true){
			for (int i=0;i<a.length;i++) {
				if (a[i] != b[i]) {
					res = false;
					break;
				}	
			}
		}
		System.out.println(res);
		int s = 0;
		for (int i : a) 
			if (i%2 == 1)
				s=s+1;			
		
		System.out.println(s);		
		
	}

}
