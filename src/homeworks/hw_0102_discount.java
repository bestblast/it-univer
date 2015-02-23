package homeworks;

public class hw_0102_discount {

	public static void main(String[] args) {
		int p = 200;
//		for (int i = 0; i < 1000; i= i+10)
			discount (p);
				
	}

	private static void discount(int p) {
		int res = 0;
		switch (p/100) {
		case 0:res = 0;			
		break;
		case 1:res = 0;			
		break;
		case 2:res = 3;			
		break;
		case 3:res = 3;			
		break;
		case 4:res = 3;			
		break;
		case 5:res = 3;			
		break;
		case 6:res = 5;			
		break;
		case 7:res = 5;			
		break;
		case 8:res = 7;			
		break;
		case 9:res = 7;			
		break;
		case 10:res = 10;			
		break;

		default:
			break;
		}		
		System.out.println("You pay: " + p + '\n' + "Your discount is: " + res);
	
	}

}
