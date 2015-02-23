package lesson_13;

public class HashTable<K,V> {
	protected IEntry<K, V> [] bucket;
	protected int size;
	
	public HashTable(){
		bucket = (IEntry<K,V> []) new IEntry[97];
	}
	public int size() {return size;}
	public boolean isEmpty(){return size ==0;}
	
	protected boolean isPrime(int x){
		for (int i = 2; i <=x/2; i++) {
			if (x%i == 0)
				return false;
		}
		return true;
	}
	protected int nextPrime(int x){
		boolean goOn = true;
		do {
			x++;
			if (isPrime(x)) 
				goOn = false;
		}while (goOn);
			return x;
	}
	protected int hashCode(K k, int Len) {
		int code = k.hashCode();
		return Math.abs(code%Len); //compression function
	}
	protected void rehashIfNeeded(){
		if((double)size/bucket.length<0.5)
			return;
		IEntry<K, V> [] n = (IEntry<K, V>[]) new IEntry[nextPrime(bucket.length*2)]; 
		for (IEntry<K, V> t : bucket) {
			if(t == null || t==AVAIL) // ... adding || t==AVAIL
				continue;
			n[hashCode(t.getKey(),n.length)]=t;
		}
		bucket = n;
	}
//	public void put(K k,V v){
//		rehashIfNeeded();
//		int ind = hashCode(k,bucket.length);
//		if(bucket[ind]!=null) throw new RuntimeException("collision");
//		bucket [ind] = new MyEntry(k, v);
//		size++;
//	}
	public void put(K k,V v){
		rehashIfNeeded();
		alreadyEx = false;
		int ind = findCell(k, MODE.PUT);
		if (alreadyEx) {
			bucket[ind] = new MyEntry(k, v);
			return;
		}
		bucket[ind] = new MyEntry(k, v);
		size++;
	}
	
//	public V get(K k){
//		int ind = hashCode(k,bucket.length);
//		return (bucket[ind]==null)?null:bucket[ind].getValue();
//	}
	public V get (K k){
		int ind = findCell(k, MODE.GR);
		if(ind ==(-1))
			return null;
		return bucket[ind].getValue();

	}
	public V remove(K k){
		int ind = findCell(k, MODE.GR);
		if(ind==-1)
			return null;
		V old = bucket[ind].getValue();
		bucket[ind]=AVAIL;
		size--;
		return old;
		
	}
//	public V remove(K k){
//		int ind = hashCode(k,bucket.length);
//		if(bucket[ind]!=null){
//			V old = bucket[ind].getValue();
//			bucket[ind]=null;
//			size--;
//			return old;
//		}
//		return null;
//			
//	}
	public String toString(){
		String toReturn = "";
		for (IEntry<K, V> t : bucket) {
			if (t == null || t==AVAIL) // adding  || t==AVAIL
				continue;
			toReturn += "\n" + t.toString();
		}
		return "HashTab[" + toReturn + "\n] Size: " + size;
	}
	protected IEntry<K, V> AVAIL = new MyEntry<K,V>(null, null);
	protected boolean alreadyEx;
	protected enum MODE{PUT,GR};
	protected int findCell(K key,MODE mode){
		int ind = hashCode(key,bucket.length);
		for (int i = 0; i < bucket.length; i++) {
			ind = (ind + 1)%bucket.length;
			switch (mode) {
			case PUT:
				if(bucket[ind]==null||bucket[ind]==AVAIL)
					return ind;
				if(bucket[ind].getKey().equals(key)){
					alreadyEx = true;
					return ind;
				}
			default: //get// remove
				if(bucket[ind]==null)
					return -1; //nonsuccess find
				if(bucket[ind]==AVAIL)
					continue;
				if(bucket[ind].getKey().equals(key))
					return ind;
			}
		}
		return -1;
	}
	
	
}
