package liang08;

public class Demo_4 {
  public static void main(String[] args) {
    Circle[] circleArray;
    circleArray = createCircleArray();
    printCricleArray(circleArray);
  }
  
  public static Circle[] createCircleArray() {
    Circle[] circleArray = new Circle[5];
    for (int i = 0; i < circleArray.length; i++) {
      circleArray[i] = new Circle(Math.random()*100);
    }
    return circleArray;
    
  }
  
  public static void printCricleArray(Circle[] c) {
    double sum = 0;
    System.out.println("radius\t\t\tarea");
    System.out.println("--------------------------------------------------");
    for (int i = 0; i < c.length; i++) {
      System.out.printf("%.6f\t\t", c[i].getRadius());
      System.out.printf("%.6f\n", c[i].area());
      sum += c[i].area();
    }
    System.out.println("---------------------------------------------------");
    System.out.printf("Total:\t\t\t%.6f\n", sum);
  }
  
}

class Circle {
  private double radius = 1;
  private static int numberOfCircles = 0;
  
  public Circle() {
    numberOfCircles++;
  }
  
  public Circle(double newRadius) {
    radius = (newRadius > 0)? newRadius : 0;
    numberOfCircles++;
  } 
  
  public void setRadius(double newRadius) {
    radius = (newRadius > 0)? newRadius : 0;
  }
  
  public double getRadius() {
    return radius;
  }
  
  public static int getNumberOfCircles() {
    return numberOfCircles;
  }
  
  public double area() {
    return Math.PI*radius*radius;
  }
}
