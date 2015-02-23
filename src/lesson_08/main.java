package lesson_08;

public class main {

	public static void main(String[] args) {
		SLNode<String> s1 = new SLNode<String>("A");
		SLNode<String> s2 = new SLNode<String>("B");
		s1.setNext(s2); // создаем следующий узел
//		s1.setElement(1);
		System.out.println(s1);
	}

}
