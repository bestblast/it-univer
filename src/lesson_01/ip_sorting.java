package lesson_01;

import java.util.*;

public class ip_sorting {

	public static void main(String[] args) {		
		
		int[ ] nums = {12, 18, 7, 20, 11, 100};			
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int t;
		
//sorting with only i
		for (int i = 0; i < nums.length/2; i++) {
			t = nums[i];
			nums[i]=nums[nums.length-1-i];
			nums[nums.length-1-i]=t;
		}
		System.out.println(Arrays.toString(nums));

//sorting with i,j
		for (int i = 0, j=nums.length-1; i < nums.length/2; i++,j--) {
			
			t = nums[i];
			nums[i] = nums[j];
			nums[j] = t;					

		}
		System.out.println(Arrays.toString(nums));

	}
}
