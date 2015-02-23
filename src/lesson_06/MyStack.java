package lesson_06;

import java.util.Arrays;
import lesson_08.IStack;

public class MyStack implements IStack{
	private String[]m;
	public MyStack(){
	m = new String[16];
	top = 0;
	}
	private int top; // вершина стека
	public int size(){
		return top;
	};
	public boolean isEmpty(){
		return top == 0;
	};
	public void push(String s){
		if(top==m.length)
			resize();
		else
			m[top++]=s;	
	}
	private void resize(){
		m=Arrays.copyOf(m, m.length*2);
	}
	public String pop(){
		if(isEmpty())throw new RuntimeException("Stack is Empty");
		return m[--top];		
	}
	public String peek(){
		if(isEmpty()) throw new RuntimeException("Empty"); 
		return m[top-1];
	}
	public String toString(){
		String r = "";
		for (int i = 0; i < top; i++) {
			r=r+m[i]+ ",";
		}
		return "["+r+"]";
		
	}
}
