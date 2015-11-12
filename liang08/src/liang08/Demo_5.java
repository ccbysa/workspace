package liang08;

public class Demo_5 {
  public static void main(String[] args) {
    Circle1 circle1 = new Circle1(1);
    Circle1 circle2 = new Circle1(2);
    
    System.out.println("before swap1");
    System.out.println(circle1.radius);
    System.out.println(circle2.radius);
    swap1(circle1, circle2);
    System.out.println("after swap1");
    System.out.println(circle1.radius);
    System.out.println(circle2.radius);
    
    System.out.println("before swap2");
    System.out.println(circle1.radius);
    System.out.println(circle2.radius);
    swap2(circle1, circle2);
    System.out.println("after swap2");
    System.out.println(circle1.radius);
    System.out.println(circle2.radius);
    
  }
  
  public static void swap1(Circle1 c1, Circle1 c2) {
    Circle1 temp = c1;
    c1 = c2;
    c2 = temp;
  }
  
  public static void swap2(Circle1 c1, Circle1 c2) {
    double temp = c1.radius;
    c1.radius = c2.radius;
    c2.radius = temp;
  }
  
}

class Circle1 {
  double radius;
  
  public Circle1(double newRadius) {
    // TODO Auto-generated constructor stub
    radius = newRadius;
  }
}
