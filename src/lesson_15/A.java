package lesson_15;

public class A {
	public A(){System.out.println("A");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new B();
		// TODO Auto-generated method stub

	}

}
class B extends A{
	static {System.out.println("stat B");};
	// блок инициализации
	{
		System.out.println("Init block B");
	}
	public B(){
		System.out.println("B");
	}
}
