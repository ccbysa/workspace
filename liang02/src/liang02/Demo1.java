package liang02;

public class Demo1 {
	public static void main(String[] args) {
		Position p1 = new Position(1.5, -3.4);
		Position p2 = new Position(4.6, 5);
		Position p3 = new Position(9.5, -3.4);
		
		LengthOfLine s1 = new LengthOfLine();
		LengthOfLine s2 = new LengthOfLine();
		LengthOfLine s3 = new LengthOfLine();
		double s1Length = s1.length(p1, p2);
		double s2Length = s2.length(p1, p3);
		double s3Length = s3.length(p3, p2);
		double s = (s1Length+s2Length+s3Length)/2;
		
		System.out.println((int)(100*Math.pow(s*
				(s-s1Length)*(s-s2Length)*(s-s3Length), 0.5))/100.0);
	
	}
}

class LengthOfLine {
	private Position p1;
	private Position p2;
	
	public double length(Position p1, Position p2) {
		return Math.pow(Math.pow(p1.getX()-p2.getX(), 2)+Math.pow(p1.getY()-p2.getY(), 2), 0.5);
	}
}

class Position {
	private double x;
	private double y;
	
	public Position(double x, double y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	} 
	
}
