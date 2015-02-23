package test;

import java.util.Random;

public class ewe2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 0; i < 100000; i++)
			System.out.println(i + " : " + random.nextInt(100000));
		
	}
	public void bogoSort(int[] n) {
		while(!inOrder(n)) shuffle(n);
	}
	
	Random random = new Random();
	
	public void shuffle(int[] n) {
		for (int i = 0; i < n.length; i++) {
			int swapPosition = random.nextInt(n.length);
			int temp = n[i];
			n[i] = n[swapPosition];
			n[swapPosition] = temp;
		}
	}

	public boolean inOrder(int[] n) {
		int length = n.length - 1;
		for (int i = 0; i < length; i++) {
			if (n[i] > n[i+1]) return false;
		}
		return true;
	}

}
