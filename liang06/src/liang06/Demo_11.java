package liang06;

import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

public class Demo_11 {
  
  public static void main(String[] args) {
    Positon a = new Positon();
    Positon b = new Positon();
    Positon c = new Positon();
    
    Scanner input = new Scanner(System.in);
    a.setX(input.nextDouble());
    a.setY(input.nextDouble());
    b.setX(input.nextDouble());
    b.setY(input.nextDouble());
    c.setX(input.nextDouble());
    c.setY(input.nextDouble());
    double s1 = length(c, b);
    double s2 = length(a, c);
    double s3 = length(b, a);
    System.out.println("s1:"+s1);
    System.out.println("s2: "+s2);
    System.out.println("s3 "+s3);
    
    double A = Math.acos((Math.pow(s1, 2)-Math.pow(s2, 2)-Math.pow(s3, 2))/(-2*s2*s3));
    double B = Math.acos((Math.pow(s2, 2)-Math.pow(s1, 2)-Math.pow(s3, 2))/(-2*s1*s3));
    double C = Math.acos((Math.pow(s3, 2)-Math.pow(s2, 2)-Math.pow(s1, 2))/(-2*s2*s1));
    
    System.out.println(A);
    System.out.println(B);
    System.out.println(C);
    
    A = Math.toDegrees(A);
    B = Math.toDegrees(B);
    C = Math.toDegrees(C);
    
    System.out.println(A);
    System.out.println(B);
    System.out.println(C);
    
  }
   
  public static double length(Positon a, Positon b) {
    return Math.sqrt(Math.pow(a.getX()-b.getX(), 2)+Math.pow(a.getY()-b.getY(), 2));
  }
   
   
} 

class Positon {
  private double x;
  private double y;
  
  public Positon(double x, double y) {
    // TODO Auto-generated constructor stub
    setX(x);
    setY(y);
  }
  
  public Positon() {
    // TODO Auto-generated constructor stub
    x = 0;
    y = 0;
  }
  
  public void setX(double x) {
    this.x = x;
  }
  public void setY(double y) {
    this.y = y;
  }
  
  public double getX() {
    return this.x;
  }
  public double getY() {
    return this.y;
  }
}
