package lesson_09;

import java.util.Iterator;

public class DLL_test {

	public static void main(String[] args) {

		DoublyLinkedList<String> dll = new DoublyLinkedList<String>();
		System.out.println(dll);
		String[]sm = {"1","2","3","4"};
		for (String t : sm) {
			dll.addLast(t);
		}
		System.out.println(dll);

		IContainer<String> c = dll.first();
		while (c!=null) {
			System.out.println(c.getElement());
			c=dll.next(c);
		}

		for (String t : dll) {
			System.out.println(t);
		}

//		while (!dll.isEmpty()) {
//			dll.remove(dll.first());
//			System.out.println("element was removed");			
//		}
		System.out.println(dll);


		DoublyLinkedList<Integer> di = new DoublyLinkedList<>();
		for (int i = 0; i < 30; i++) {
			di.addFirst((int) (Math.random()*1000));

		}

		System.out.println(di);

		IContainer<Integer> ci = di.first();
		while(ci!=null){
			IContainer<Integer> nx = di.next(ci);
			if(ci.getElement()%2==0)
				di.remove(ci);
			ci = nx;
		}
		System.out.println(di);
		

		Iterator<String> it3 = dll.iterator();
		System.out.println(dll);
		while (it3.hasNext()){
			String s = it3.next();// ремув работает только если вызывается некст перед ним!!!
			it3.remove();
		}
		System.out.println("lst");
		System.out.println(dll);
			


	}

}
