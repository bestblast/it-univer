package lesson_09;

import java.util.Iterator;

public class DoublyLinkedList<E> implements Iterable<E>{ // позволяет использовать for (O t : m) {}
	private DLNode<E> head,tail;
	private int size;

	public DoublyLinkedList(){
		head = new DLNode<E>(null,this);
		tail = new DLNode<E>(null,this);
		head.setNext(tail);
		tail.setPrev(head);
	}
	public int size(){return size;}
	public boolean isEmpty(){return size == 0;}
	public IContainer<E> addFirst(E e){
		DLNode<E> newOne = new DLNode<E>(e, this);
		DLNode<E> oldFirst = head.getNext();
		newOne.setNext(oldFirst);
		oldFirst.setPrev(newOne);
		head.setNext(newOne);
		newOne.setPrev(head);
		size++;
		return newOne;	
	}
	public IContainer<E> addLast(E e){
		DLNode<E> newOne = new DLNode<E>(e, this);
		DLNode<E> oldLast = tail.getPrev();
		newOne.setNext(tail);
		tail.setPrev(newOne);
		oldLast.setNext(newOne);
		newOne.setPrev(oldLast);
		size++;
		return newOne;
	}
	private DLNode<E> check(IContainer<E> nd){
		if(nd == head || nd == tail) throw new RuntimeException("wrong list");
		if(!(nd instanceof DLNode)) throw new RuntimeException("wrong node type"); // является ли переменная DLNode<E>
		DLNode<E> toReturn=(DLNode<E>) nd;
		if (toReturn.getOwner()!=this) throw new RuntimeException("owner!");
		return toReturn;
	}
	private void checkIfEmpty(){
		if(isEmpty()) throw new RuntimeException("empty list");
	}
	public IContainer<E> first(){
		checkIfEmpty();
		return head.getNext();
	}
	public IContainer<E> last(){
		checkIfEmpty();	
		return tail.getPrev();
	};
	public IContainer<E> next(IContainer<E> n) {
		DLNode<E> node = check(n);
		return (node.getNext()!=tail)?node.getNext():null;
	}
	public IContainer<E> prev(IContainer<E> n) {
		DLNode<E> node = check(n);
		return (node.getPrev()!=head)?node.getPrev():null;
	}
	public E remove(IContainer<E> nd){
		checkIfEmpty();
		DLNode<E> node = check(nd);
		DLNode<E> before = node.getPrev();
		DLNode<E> after = node.getNext();
		before.setNext(node.getNext());
		after.setPrev(node.getPrev());
		//отключение от списка:
		node.setPrev(null);
		node.setNext(null);
		node.setOwner(null);
		size--;
		
		return nd.getElement();
	}

	@Override
	public String toString(){
		DLNode<E> c = head.getNext();
		String toReturn = "";
		while(c!=tail){
			toReturn +=c.getElement() + ",";
			c=c.getNext();
		}
		return "DLList: ["+ toReturn + "] Size: " + size();
	}
	// добавить новый узел после конт со значением е
	public void addAfter(IContainer<E> cont, E e){
		DLNode<E> node = check(cont);
		DLNode<E> newOne = new DLNode<E>(e, this);
		DLNode<E> after = node.getNext();
		newOne.setPrev(node);
		node.setNext(newOne);
		newOne.setNext(after);
		after.setPrev(newOne);
		size++;
//		return newOne;	
	}

	
	public class InnerIter implements Iterator<E>{

		public boolean hasNext() {
			return current!=tail;
		}

		public E next() {
			E toReturn = current.getElement();
			current = current.getNext();
			return toReturn;
		}

		private DLNode<E> current;
		private InnerIter(){current = head.getNext();}
		public void remove() {DoublyLinkedList.this.remove(current.getPrev());}

		
	}

	public Iterator<E> iterator() {
		return new InnerIter();
	}


}
