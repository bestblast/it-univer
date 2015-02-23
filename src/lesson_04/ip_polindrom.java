package lesson_04;

public class ip_polindrom {

	public static void main(String[] args) {
		String s = "radar";
		boolean b = isPolindrom(s,0,s.length()-1);
		System.out.println(b);
	}
	static boolean isPolindrom(String s, int i,int j){
		if (i==j)
			return true;
		if (s.charAt(i)!=s.charAt(j))
			return false;
		return isPolindrom(s, i+1, j-1);			
	}
}
