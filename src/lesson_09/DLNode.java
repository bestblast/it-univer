package lesson_09;

public class DLNode<E> implements IContainer<E>{
	private E element;
	public E getElement(){return element;}
	public void setElement(E e){element = e;}
	private DLNode<E> next,prev;
	public DLNode<E> getNext(){return next;}
	public void setNext(DLNode<E> e){next = e;}
	public DLNode<E> getPrev(){return prev;}
	public void setPrev(DLNode<E> e){prev = e;}
	
	public DLNode (E e){element = e;}
	
	private Object owner;
	public Object getOwner(){return owner;}
	public DLNode(E e, Object o){this(e);owner = o;}
	public void setOwner(Object o){owner = o;}
	

}
