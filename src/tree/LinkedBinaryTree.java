package tree;

import java.util.Iterator;
import lesson_09.DoublyLinkedList;
import lesson_09.IContainer;

public class LinkedBinaryTree<E> {
	LinkedBinaryTree(traversal_type t){
		this.t_type = t;
	}
	enum traversal_type {
		preorder,postorder,inorder
		}
	private traversal_type t_type;
	private BTNode<E> root;
	private int size;
	public int size(){return size;}
	public boolean isEmpty(){return size==0;}
	private BTNode<E> check(IContainer<E> c){
		return(BTNode<E>)c;
	}
	public boolean hasLeft(IContainer<E> c){
		BTNode<E> n = check(c);
		return n.getLeft() != null;
	}
	public boolean hasRight(IContainer<E> c){
		BTNode<E> n = check(c);
		return n.getRight() != null;
	}
	public IContainer<E> left(IContainer<E> c){
		BTNode<E> n = check(c);
		return n.getLeft(); 
	}
	public IContainer<E> right(IContainer<E> c){
		BTNode<E> n = check(c);
		return n.getRight(); 
	}
	public IContainer<E> parent(IContainer<E> c){
		BTNode<E> n = check(c);
		return	n.getParent();
	}
	public IContainer<E> root(){
		return root;
	}
	public boolean isInternal(IContainer<E> c){
		BTNode<E> n = check(c);
		return hasLeft(n)||hasRight(n);
	}
	public boolean isExternal(IContainer<E> c){
		return !isInternal(c);
	}
	public IContainer<E> addRoot(E e) {
		if(!isEmpty()) throw new RuntimeException("not empty!");
		root = new BTNode<E>(e);
		size = 1;
		return root;
	}
	public IContainer<E> insertLeft(IContainer<E> c,E e){
		BTNode<E> n = check(c);
		if (hasLeft(c)) throw new RuntimeException("has left element");
		BTNode<E> newOne = new BTNode<E>(e);
		n.setLeft(newOne);
		newOne.setParent(n);
		size++;
		return newOne;
	}
	public IContainer<E> insertRight(IContainer<E> c,E e){
		BTNode<E> n = check(c);
		if (hasRight(c)) throw new RuntimeException("has right element");
		BTNode<E> newOne = new BTNode<E>(e);
		n.setRight(newOne);
		newOne.setParent(n);
		size++;
		return newOne;
	}
	public Iterator<E> iterator(){
		DoublyLinkedList<E> list = new DoublyLinkedList<E>();
		switch (t_type) {
		case inorder:inorder(root, list);
		break;
		case postorder:postorder(root, list);
		break;
		case preorder:preorder(root, list);
		break;
		}
		return list.iterator();
	}
	private void preorder(IContainer<E> c, DoublyLinkedList<E> list) {
		if(c == null)
			return;
		list.addLast(c.getElement());// сначала записать текущий узел
		if(hasLeft(c))
			preorder(left(c), list);
		if(hasRight(c))
			preorder(right(c), list);
	}
	private void postorder(IContainer<E> c, DoublyLinkedList<E> list) {
		if(c == null)
			return;
		if(hasLeft(c))
			postorder(left(c), list);
		if(hasRight(c))
			postorder(right(c), list);
		list.addLast(c.getElement());// записать текущий узел
	}
	private void inorder(IContainer<E> c,DoublyLinkedList<E> list) {
		if(c==null)
			return;
		if(hasLeft(c))
			inorder(left(c), list);
		list.addLast(c.getElement());
		if (hasRight(c)) {
			inorder(right(c), list);
		}
	}
	private int depth(IContainer<E> c){
		BTNode<E> n = check(c);
		int dep = 0;
		while (n!= root) {
			dep++;
			n = n.getParent();
		}
		return dep;
	}
	public Iterator<IContainer<E>> containers() {
		DoublyLinkedList<IContainer<E>> list = new DoublyLinkedList<IContainer<E>>();
		rightLeft(root, list);
		return list.iterator();
	}
	private void rightLeft(IContainer<E> c, DoublyLinkedList<IContainer<E>> list){
		if(c==null)
			return;
		if(hasRight(c))
			rightLeft(right(c), list);
		list.addLast(c);
		if(hasLeft(c))
			rightLeft(left(c), list);
	}
	public void print(){
		Iterator<IContainer<E>> it = containers();
		while (it.hasNext()) {
			IContainer<E> c = it.next();
			int dep = depth(c);
			String offset = "";
			for (int i = 1; i <= dep; i++) {
				offset+="\t";
			}
			System.out.println(offset + c.getElement());
		}
	}
	public String toString(){
		String toReturn = "";
		Iterator<E> it = iterator();
		while (it.hasNext()) {
			toReturn += it.next() + ",";
		}
		return "LinkedBinTree[" + toReturn + "]size="+size;
	}
	public boolean isProper(IContainer<E> c){
		if(isInternal(c)){
			if(hasLeft(c) && hasRight(c))                       // оба потомка есть.. 
				return isProper(left(c)) && isProper(right(c)); //
			else return false;
		}
		else {
			return true;
		}			
	}
}
