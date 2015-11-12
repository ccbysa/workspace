package liang05;

public class Demo_9 {
  public static void main(String[] args) {
    System.out.println(max(5, 7));
    System.out.println(max(8.9, 7));
    System.out.println(max(5, 9, 2));
  }
  
  public static int max(int a, int b) {
    System.out.println("function 1.");
    return (a>b) ? a:b;
  }
  
  public static double max(double a, double b) {
    System.out.println("function 2.");
    return (a>b)? a:b;
  }
  public static int max(int a, int b, int c) {
    System.out.println("function 3.");
    return (max(a, b)>c)? max(a, b):c;
  }
}
