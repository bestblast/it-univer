package tree;

import tree.LinkedBinaryTree.traversal_type;
import lesson_09.IContainer;

public class btn_test {

	public static void main(String[] args) {
		LinkedBinaryTree<Integer> lbt	=	new	LinkedBinaryTree<>(traversal_type.inorder);
		System.out.println(lbt);
		IContainer<Integer> r = lbt.addRoot(10);
		IContainer<Integer> i5 = lbt.insertLeft(r, 5);
		lbt.insertLeft(i5, -2);
		lbt.insertRight(i5, 8);
		lbt.insertRight(r, 15);
		System.out.println(lbt);
		System.out.println("=========================");
		lbt.print();
		System.out.println(lbt.isProper(i5));
		System.out.println(lbt.isProper(lbt.root()));

	}
}

