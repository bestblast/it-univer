package lesson_08;

public interface IStack {  //предполагается что все методы public abstract
	String pop();
	void push(String s);
	String peek();
	int size();
	boolean isEmpty();

}
