package lesson_06;

import java.util.Arrays;

public class FBCountry_test {

	public static void main(String[] args) {

		FBCountry []m = {new FBCountry("Brazil",5),
				new FBCountry("France",1),
				new FBCountry("Rus",2),
				new FBCountry("Italy",3),
				new FBCountry("Ukraine",0)

		};
		Arrays.sort(m);
		System.out.println(Arrays.toString(m));
	}

}
