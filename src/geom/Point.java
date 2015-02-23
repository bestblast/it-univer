package geom;

public class Point {//описание двумерной точки...
	protected int x,y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	public String toString() {
		return "X=" + x + "\nY=" + y; 
		
	}
	public double dist(){
		return Math.sqrt(x*x + y*y);
	}
	public void print() {
		System.out.println(toString() + "\ndist=" + dist());
//		System.err.println(toString() + "\ndist=" + dist());
	}
	

}
