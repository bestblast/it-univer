package lesson_08;

public class SLList_test {

	public static void main(String[] args) {
		SinglyLinkedList<String> sll = new SinglyLinkedList<>();
		System.out.println(sll);
		String ls [] = {"Java","Pascal","Assembler","Basic","ASM","C++","PHP","ADA"};
		for (String t : ls) {
			sll.addLast(t);
		}
		System.out.println(sll);
		while(!sll.isEmpty())
//			System.out.println(sll.removeFirst());
			System.out.println(sll.removeLast());		
		System.out.println(sll);
		
		SinglyLinkedList<Integer> si = new SinglyLinkedList<Integer>();
		int x = 36;
		int i = 1;
		while(i<= x){
			if (x%i==0)
				si.addLast(i);
			i++;	
		}
		System.out.println(si);

		SinglyLinkedList<String> sA = new SinglyLinkedList<String>();
		for (String t : ls) {
			if(t.length() - t.toLowerCase().replace("a", "").length() == 2)
				sA.addLast(t);			
		}
		System.out.println(sA);

	}
}
