package lesson_08;

public class SinglyLinkedList <E> {
	private SLNode<E> head, tail; //специальные узлы в голове и конце списка
	private int size;
	public SinglyLinkedList(){
		head = new SLNode(null);
		tail = new SLNode(null);
		head.setNext(tail);
	}
	public void addFirst(E e){
		SLNode<E> newOne = new SLNode(e);
		SLNode<E> oldFirst = head.getNext();
		head.setNext(newOne);
		newOne.setNext(oldFirst);
		size++;
	}
	public int size(){return size;}
	public boolean isEmpty(){return size == 0;}
	public E removeFirst(){
		if(isEmpty())throw new RuntimeException("Empty list");
		SLNode<E> oldFirst = head.getNext();
		head.setNext(oldFirst.getNext());
		oldFirst.setNext(null);
		size--;
		return oldFirst.getElement();
	}
	public void addLast(E e){
		SLNode<E> current = head;
		while(current.getNext()!=tail)
			current = current.getNext();
		SLNode<E> newOne = new SLNode(e);
		current.setNext(newOne);
		newOne.setNext(tail);
		size++;
	}
	public E removeLast(){
		if(isEmpty()) throw new RuntimeException("Error, list is empty!!!");
		SLNode<E> current = head;
		while (current.getNext().getNext()!= tail) 
			current = current.getNext();
		SLNode<E> oldLast = current.getNext();
		current.setNext(tail);
		oldLast.setNext(null);
		size--;
		return oldLast.getElement();		
	}
	public String toString(){
		SLNode<E> c = head.getNext();
		String toReturn = "";
		while (c!=tail){
			toReturn +=c.getElement() + ",";
			c=c.getNext();
		}
		return "SLList["+toReturn + "]";
	}

}
