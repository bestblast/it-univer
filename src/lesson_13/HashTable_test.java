package lesson_13;

public class HashTable_test {

	public static void main(String[] args) {
		
		HashTable<String, Integer> cc = new HashTable<String,Integer>();
		cc.put("Ukraine", 604);
		cc.put("Italy", 301);
		System.out.println("Ca".hashCode());
		System.out.println(31*31*31);
		System.out.println(cc);
		cc.put("Ukraine", 600);
		System.out.println(cc);
		System.out.println(cc.remove("Ukraine"));
		System.out.println(cc.remove("poland"));
		cc.remove("Ukraine");
		cc.remove("poland");
		System.out.println(cc);
		
		
	}
}
