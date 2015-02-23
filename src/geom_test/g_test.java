package geom_test;

import geom.Point;

public class g_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point_3D p3 = new Point_3D(12, 23, 4);
		System.out.println(p3);
		p3.print();
		Point[] m = {new Point(2, 3), new Point_3D(1, 2, 3), new Point(2, 0)};
		for (Point t : m) {
			System.out.println(t);
		}

	}

}
