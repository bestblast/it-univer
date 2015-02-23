package lesson_13;

public class MyEntry<K,V> implements IEntry<K, V>{
	protected K k;
	protected V v;
	
	public MyEntry(K k,V v){
		this.k = k;
		this.v = v;
	}
	public K getKey(){
		return k;}
	public V getValue(){
		return v;}
	public String toString(){
		return "k = " + k + " v = " + v; 
	}
}
