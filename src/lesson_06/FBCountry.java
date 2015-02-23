package lesson_06;

public class FBCountry implements Comparable{
	
	private int c;
	private String name;
	public FBCountry(String n,int c){
		name = n;
		this.c = c;
	};
	public String toString(){
		return name + " champ= " + c;
	}
	public int compareTo(Object ob){
		FBCountry another = (FBCountry)ob;
		if (this.c > another.c)
			return 1;
		else if (this.c < another.c)
			return -1;
		else
			return 0;
			
		
			
		
		
	};
	
	

}
