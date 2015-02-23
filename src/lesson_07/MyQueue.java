package lesson_07;

import java.util.Stack;

import lesson_06.MyStack;

public class MyQueue {
	
	private String []m;
	private int start;
	private int end; // end >= start
	
	public int size(){
		return end - start;
	}
	
	public boolean isEmpty(){
		return size() == 0;
	}
	
	public MyQueue(){
		m = new String[8];
	}
	
	private int realIndex(int index){
		return index%m.length;
	}
	private int realIndex(int index, int N){
		return index%N;
		
	}
	private void resize(){
		String[]n = new String[m.length*2];
		for (int i = start; i < end; i++) {
			n[realIndex(i,n.length)] = m[realIndex(i)];			
		}
	}
	public void enqueue(String s){
		if (size()>=m.length)
			resize();
		m[realIndex(end)]=s;
		end++;
	}
	public String dequeue(){
		if(isEmpty())throw new RuntimeException("queue is empty");
		String r = m[realIndex(start)];
		start++;
		return r;
	}
	public String toString(){
		String toRet = "";
		for (int i = start; i < end; i++) {
			toRet +=m[realIndex(i)] + ",";
		}
		return "[" + toRet + "]";
	}
	public void reverse(MyStack q){
		Stack s = new Stack()
		while(q.size()){			
			s.push(q.);
			
			
		}


	}
	
	public String front (){
		if(isEmpty()) throw new RuntimeException("ee");
		return m[realIndex(start)];
	}
	
}
