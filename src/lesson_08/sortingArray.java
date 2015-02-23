package lesson_08;

public class sortingArray {
	
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
		}
	}
	

}
