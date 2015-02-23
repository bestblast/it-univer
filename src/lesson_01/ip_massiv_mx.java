package lesson_01;

public class ip_massiv_mx {

	public static void main(String[] args) {
		int [][]mx = {
				{1,2,-3,4},
				{55,-6}
		};
		
		out:for (int i = 0; i < mx.length; i++) {//out - метка, массив которого мы покидаем 
			for (int j = 0; j < mx[i].length; j++) {
				if (mx[i][j] < 0) 
					//break out; //метка для возвращения 
					continue out;
				
				System.out.println(mx[i][j]);
			}
		}
	}
}
