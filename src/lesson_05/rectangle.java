package lesson_05;

import java.util.Arrays;

public class rectangle {

	public static void main(String[] args){

		rec rc = new rec(8);
		rc.Area();
		System.out.println(rc.Area());
		rc.draw(false);
		
		rec[]mrec = {new rec(2, 2),new rec(6, 2)};
		Arrays.sort(mrec);
		System.out.println(Arrays.toString(mrec));
		
	}

}


class rec implements Comparable{

	private int w,h;

	public rec(int w, int h)
	{
		if (w<=0||h<=0)
			throw new RuntimeException("negative value!");
		this.w=w;
		this.h=h;
	}

	public rec (int z) // как это работает?????
	{
		this(z,z);
		w=h=z;
	}

	public int Area()
	{
		return w*h;
	}


	public void draw (boolean follow)
	{
		if (follow)
			for (int i=1; i<=h;i++)
			{
				for (int j=1; j<=w;j++)
					System.out.print("*");
				System.out.println();
			}
		else
			for (int i=1; i<=h;i++)
			{
				for (int j=1; j<=w;j++)
					if (i==1||i==h||j==1||j==w)
						System.out.print("*");
					else
						System.out.print(" ");
				System.out.println();
			}
	}

	public String toString()
	{
		return "rectangle w = "+ w +" h = " + h;
	}
	public int compareTo(Object r){
		rec another = (rec)r;
		return this.Area() - another.Area();
	}

}