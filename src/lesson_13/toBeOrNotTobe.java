package lesson_13;

public class toBeOrNotTobe {

	public static void main(String[] args) {
		String text = "To be or not to be";
		HashTable<String, Integer> ht = new HashTable<>();
		for (String t : text.toLowerCase().split(" ")) {
			if(ht.get(t)!=null){
				ht.put(t, ht.get(t)+1);
			} else {
				ht.put(t,1);
			}
		}
		System.out.println(ht);
	}
}
