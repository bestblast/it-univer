package homeworks;
import java.util.Arrays;



public class hw_0301_caesar {


	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		String text = "ardvj sfeu zj rsjvek ze cfeufe efn";
		String text = "assembler";
		String s = "abcdefghijklmnopqrstuvwxyz";
		char [] symbolsArr = s.toCharArray();
		String [] wordsArr = text.split(" ");
		System.out.println(Arrays.toString(symbolsArr));
		System.out.println(Arrays.toString(wordsArr));

		for (int shift = 0; shift < s.length(); shift++) {
			StringBuffer finalText = new StringBuffer();

			for (String string : wordsArr) {
				char [] wordChars = string.toCharArray();
				//			System.out.println(wordChars);
				int n = 0;
				//			int shift = 9;
				//			for (int shift = 0; shift <=26; shift++) {

				for (char c : wordChars) {
					//				System.out.println(wordChars[i]);
					n = s.indexOf(c) + shift;
					//				System.out.println(n);
					if (n>=s.length()){
						n = n%s.length();
					} 

					//				System.out.println(s.indexOf(c));
					//				System.out.println(n);
					finalText.append(s.charAt(n));
				}
				//			System.out.println(symbolsArr[4]);
				finalText.append(" ");

			}
			System.out.println("["+ shift + "] : "+finalText);
			//		finalText = null;
		}
	}
}

