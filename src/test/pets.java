package test;

public class pets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		dog.getClass();
		System.out.println(dog.getClass());
		System.out.println(dog.toString());
		
		cat.setMale(true);
	}

}
