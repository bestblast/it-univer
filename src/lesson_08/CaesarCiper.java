package lesson_08;

public class CaesarCiper {
	private CircleList<Character> cl;
	private int shift;
	private char start,fin;
	public CaesarCiper(int sh){
		shift = sh;
		this.fin = 'z';
		this.start = 'a';
		cl = new CircleList<Character>();
		for (char ch = fin;ch>=start; ch--) {
			cl.addFirst(ch);			
		}
	}
	public CaesarCiper(int sh, char chFirst, char chLast){
		shift = sh;
		start = chFirst;
		fin = chLast;
		cl = new CircleList<Character>();
		for (char ch = chLast;ch>=chFirst; ch--) {
			cl.addFirst(ch);			
		}
		
	}
	private char encode (char c){
		int dif = c-start;
		return cl.getNode(dif + shift);
	}
	private char decode (char c){
		int dif = c-start;
		return cl.getNode(dif - shift);
	}
	public String encode(String s) {
		String toReturn = "";
		for (char t : s.toCharArray()) {
			toReturn +=encode(t);
			
		}
		return toReturn;
	}
	public String decode(String s) {
		String toReturn = "";
		for (char t : s.toCharArray()) {
			toReturn +=decode(t);
			
		}
		return toReturn;
	}
	

}
