package lesson_08;

public class CircleList <E> {
	private SLNode<E> curcor;
	private int size;
	public CircleList(){
		curcor = new SLNode<E>(null);
		curcor.setNext(curcor);		
	}
	public int size(){return size;}
	public boolean isEmpty(){return size == 0;}
	public void addFirst(E e){
		SLNode<E> newOne = new SLNode<E>(e);
		if(isEmpty()){
			curcor.setNext(newOne);
			newOne.setNext(curcor);
		} else {
			SLNode<E> oldFirst = curcor.getNext();
			newOne.setNext(oldFirst);
			curcor.setNext(newOne);
		}
		size++;
	}
	public E removeFirst(){
		if(isEmpty()) throw new RuntimeException("Empty!");
		SLNode<E> oldFirst = curcor.getNext();
		curcor.setNext(oldFirst.getNext());
		oldFirst.setNext(null);
		size--;
		return oldFirst.getElement();
	}
	public E getNode(int index){
		if (isEmpty()) throw new RuntimeException("Empty!");
		if(index < 0)
			index = size() + index;
		SLNode<E> current = curcor.getNext();
		for(int i = 0;i<index;i++){
			current = current.getNext();
			if(current==curcor)
				current=current.getNext();
		}
		return current.getElement();
	}
	public String toString(){
		SLNode<E> c = curcor.getNext();
		String toReturn = "";
		while (c!=curcor){
			toReturn +=c.getElement() + ",";
			c=c.getNext();
		}
		return "CircleList["+toReturn + "]";


	}


}
