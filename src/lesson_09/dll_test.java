package lesson_09;

public class dll_test {

	public static void main(String[] args) {
		
		DoublyLinkedList<String> dll = new DoublyLinkedList<>();
		System.out.println(dll);
		String[]ss = {"a","b","c","d","b","c","d"};
		for (String t : ss) {
			dll.addLast(t);
		}
		System.out.println(dll);
		System.out.println(dll.next(dll.first()).getElement());
		
		//вывести элементы списка, начиная с последнего элемента
		
		IContainer<String> c = dll.last();
		while(c!=null){
			System.out.print(c.getElement());
			c=dll.prev(c);
		}
		IContainer<String> test = dll.next(dll.first());
		dll.addAfter(test, "!!!!");
		System.out.println(dll);


	}

}
