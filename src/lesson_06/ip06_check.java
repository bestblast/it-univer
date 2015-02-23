package lesson_06;

public class ip06_check {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String exp = "(((a+b)+z)*4)";
		String exp2 = "(((a+b)+z))*4))";

		System.out.println(isValidEsp(exp));
		System.out.println(isValidEsp(exp2));

	}

	static boolean isValidEsp(String exp){
		MyStack ms = new MyStack();
		char[]m = exp.toCharArray();
		for (char c : m) {
			if(c=='(')
				ms.push("(");
			else
				if(c==')'){
					if(ms.isEmpty()) // если нет соотв (
						return false;
					ms.pop();
				}


		}
		if(ms.isEmpty())
			return true;
		else
			return false;
	}


}
