package hk.com.google.test;

public class TestConstruct {
	public static void main(String[] args) {
		Point aPoint = new Point(3.5, 4.6, 8.7);
		aPoint.getPoint(aPoint);
		aPoint.setX(4);
		aPoint.getPoint(aPoint);
		Point anoPoint = new Point(30, 40, 80);
		System.out.println(aPoint.distance(anoPoint));
	}
}
