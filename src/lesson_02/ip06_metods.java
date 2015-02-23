package lesson_02;
public class ip06_metods {
	
	
	public static void main(String[] args) {
		
		System.out.println(summ(3,4));
		System.out.println(avg(1, 35));
		System.out.println(pow(2, 2));
//		System.out.println(max(2, 0));
		
	}
	
	static int summ(int a,int b){
		return a+b;
	}
	static double avg(int a,int b){
		return (a+b)/2.0;
	}
	static int pow(int a,int b){
		int pow = 1;
		for (int i = 0; i < b; i++) {
			pow = pow * a;				
		}
		return pow;
	}
//	static int max(int []m) {
//		
//		return 0;
//		
//	}

}
