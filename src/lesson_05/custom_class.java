package lesson_05;

public class custom_class {

	public static void main(String[] args) {
		//		posInt p1 = new posInt(4);
		//		System.out.println(p1.isEven());

		//		for (int i = 0; i <=100; i++) {
		//			int cb = i*i*i;
		//			System.out.println(Math.pow(cb, 1.0/3.0));
		//			System.out.println(Math.cbrt(cb));
		//		}

		posInt[]m = {new posInt(9),new posInt(100000),new posInt(248832),new posInt(25)};
		for (posInt posInt : m) {
			System.out.println(posInt);
			System.out.println("Even? - " + posInt.isEven());
			System.out.println("Odd? - " + posInt.isOdd());
			System.out.println("Square? - " + posInt.isSquare());
			System.out.println("Divisors - " + posInt.allDivisors());
			System.out.println("CubeRt - " + posInt.isCube());
			System.out.println("5thPower - " + posInt.is5thPower());
			System.out.println("Before? - " + posInt.before(new posInt(18)));
			System.out.println("After? - " + posInt.after(new posInt(2)));
//			System.out.println("Triple - " + posInt.getPythTriple());
			System.out.println("==========");

		}
		posInt tr = new	posInt(98);
		int[]tmp = tr.getPythTriple();
		for (int i : tmp) {
			System.out.println(i);
		}
		
		
	}
}

class posInt { //positive numbers
	private int x; //field должны скрыть от других программистов.
	public posInt (int a) { //конструктор. проверка качества входных данных
		if (a<=0) 
			throw new RuntimeException("Negative value!"); //error on incorrect data
		x = a;
	}
	public boolean isEven(){ //check for even
		return x%2==0;
	}
	public boolean isOdd(){ //check for even
		return x%2!=0;
	}
	public boolean isSquare(){ //check for even
		return Math.pow(x, 0.5)%1==0;
	}
	public String allDivisors(){ //check for even
		int integer = x;
		String divisors = ""; 
		for(int count = 2; count <= integer/2; count++) 
		{ 
			if(integer%count == 0) 
				divisors += count + ", "; 
		} 

		return divisors.toString();

	}
	public String toString() {
		return "x = " + x + " ";

	}
	public boolean isCube() {

		return Math.cbrt(x)%1==0;

	}
	public boolean is5thPower() {
		int temp = (int) Math.pow(x, 1.0/5.0);
		//		System.out.println(temp + " " + Math.pow(x, 1.0/5.0));

		//		return x==Math.pow(temp, 5);

		if(Math.pow(temp, 5)==x)
			return true;
		if(Math.pow(temp+1, 5)==x)
			return true;
		else 
			return false;		
	}	
	public boolean before(posInt a) {
		return x < a.x;
	}
	public boolean after(posInt a) {
		return x > a.x;
	}
	public int[] getPythTriple(){
		int[]m = new int[3];
		if (Math.pow(x, 0.5)%1==0)
		{
			for (int i = 1; i < x; i++) {
				for (int j = 1; j < x; j++) {
					if (i*i+j*j==x)
					{
						m[0]= i;
						m[1]= j;
						m[2]= (int) Math.pow(x, 0.5);
						return m;
					}
				}
			}
		}
		return m;		
	}
}