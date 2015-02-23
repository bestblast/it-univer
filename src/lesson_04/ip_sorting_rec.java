package lesson_04;
import java.util.Arrays;


public class ip_sorting_rec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] mx = {6,3,7,56,8,45,4,78,1};
		System.out.println(Arrays.toString(mx));
		selSort(mx);
		System.out.println(Arrays.toString(mx));
		selSortrec(mx, 0);
		System.out.println(Arrays.toString(mx));


	}
	static void selSort(int[]m){
		for (int i = 0; i < m.length; i++) {
			int mInd = i;
			for (int j = i+1; j < m.length; j++) {
				if(m[j]<m[mInd])
					mInd = j;				
			}
			if (mInd>i){
				int t = m[mInd];
				m[mInd] = m[i];
				m[i] = t;
			}
		}

	}
	static void selSortrec(int[]m,int start){
		if (start>=m.length)
			return;		
		int mInd = start;
		for (int j = start+1; j < m.length; j++) {
			if(m[j]<m[mInd])
				mInd = j;				
		}
		if (mInd>start){
			int t = m[mInd];
			m[mInd] = m[start];
			m[start] = t;
		}
		selSortrec(m,start+1);

	}



}
