package geom_test;

import geom.Point;

public class Point_3D extends Point	{
	protected int z;
	public Point_3D(int x,int y,int z) {
		super(x, y);
		this.z = z;
	}
	public String toString(){
		return super.toString() + "\nZ=" + z; //использование слова SUPER..
	}

}
