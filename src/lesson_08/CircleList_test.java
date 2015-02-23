package lesson_08;

public class CircleList_test {

	public static void main(String[] args) {
		
		String [] s = {"a","b","c","d","e","f"};
		CircleList<Character> cl = new CircleList<>();
		for (char ch='z';ch>='a';ch--){
			cl.addFirst(ch);
		}
		System.out.println(cl);
		System.out.println(cl.getNode(0));
		System.out.println(cl.getNode(10000000));
		
		

	}

}
