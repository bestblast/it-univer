package lesson_08;

import java.io.File;
import java.util.Arrays;

public class sort_test {

	public static void main(String[] args) {
		
		String [] ms = {"a","bc","etrt","er"};
		sort(ms);
		System.out.println(Arrays.toString(ms));
		
		File[]mf = {new File("C"),new File("D"),new File("у"),new File("темп")};
		sort(mf);
		System.out.println(Arrays.toString(mf));
		
		StringBuffer sb[] = {new StringBuffer(),
				new StringBuffer("arb")};
//		sortc(sb);
		sort(sb);
		
	}
	static void sort(int[]m){
		for (int i=1;i<m.length;i++){
			int j = i;
			int c = m[i];
			while(j>0 && m[j-1]>c){
				m[j]=m[j-1];
				j--;
			}
			m[j]=c;
		}
	}
	static void sort (Object[] m){
		for(int i = 1;i < m.length;i++){
			int j = i;
			Object c = m[i];
			while(j>0 && ((Comparable)m[j-1]).compareTo(c)>0) {
				m[j]=m[j-1];
				j--;
			}
			m[j] = c;
		}
	}
	static void sortc (Comparable[] m){ //раннее предупреждение ошибки о несоотв типе данных.
		for(int i = 1;i < m.length;i++){
			int j = i;
			Comparable c = m[i];
			while(j>0 && (m[j-1]).compareTo(c)>0) {
				m[j]=m[j-1];
				j--;
			}
			m[j] = c;
		}
	}

}
