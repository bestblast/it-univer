package lesson_13;

import java.util.ArrayList;

public class collisions_test {

	public static void main(String[] args) {
		
		final int N = 101; //array.lenght
		ArrayList<Integer> ar = new ArrayList<>();
		int col = 0;
		for (int i = 0; i <= 500; i+=6) {
			int r = i%N;
			if(ar.contains(r))
				col++;
			ar.add(r);
		}
		System.out.println("Collisions = " + col);
	}
}
