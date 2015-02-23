package lesson_08;

public class SLNode <E> { //singly-linked list 
	
	private E element;
	private SLNode<E> next;
	public SLNode(E inp){element = inp;}
	public E getElement(){return element;}
	public void setElement(E e){element = e;}
	public SLNode<E> getNext(){return next;}
	public void setNext(SLNode<E> n) {next = n;}	

}
