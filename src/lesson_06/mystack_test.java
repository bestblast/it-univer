package lesson_06;

public class mystack_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyStack ms = new MyStack();
		ms.push("Brazil");
		ms.push("USA");
		ms.push("Urugvay");
		ms.push("Russia");
		ms.push("France");
		System.out.println(ms);
		while (ms.isEmpty()==false) {
			System.out.println(ms.pop());
			
		}
		System.out.println(ms);

	}

}
