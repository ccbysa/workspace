package hk.com.google.test;

public class Point {
	double x;
	double y;
	double z;
	
	public Point(double _x, double _y, double _z){
		x = _x;
		y = _y;
		z = _z;
	}
	
	public void setX(double a) {
		x = a;
	}
	public void setY(double a) {
		y = a;
	}
	public void setZ(double a) {
		z = a;
	}
	public void getPoint(Point p){
		System.out.println("Point.getPoint()");
		System.out.println("x:" + p.x);
		System.out.println("y:" + p.y);
		System.out.println("z:" + p.z);
	}
	public double distance(Point p){
		double d = (x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z);
		return Math.sqrt(d);
	}
}
