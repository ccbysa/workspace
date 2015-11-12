package liang05;

public class Demo_10 {
  public static void main(String[] args) {
    System.out.println("PI = "+Math.PI);
    System.out.println("E = "+Math.E);
    System.out.println(Math.sin(Math.PI/2));
    System.out.println(angleToRadian(60));
    System.out.println(Math.toRadians(60));
    System.out.println(Math.toDegrees(Math.PI/2));
    System.out.println(Math.asin(1));
    System.out.println(Math.toDegrees(Math.asin(1)));
    System.out.println(Math.toDegrees(Math.asin(-1)));
    System.out.println(Math.acos(1));
    System.out.println(Math.acos(1));
    System.out.println(Math.acos(-1));
    System.out.println(Math.exp(1));
    System.out.println(Math.E);
    System.out.println(Math.exp(2));
    System.out.println(Math.log(Math.E));
    System.out.println(Math.log(Math.exp(3.5)));
    System.out.println(Math.log10(100));
    System.out.println(Math.sqrt(5));
    System.out.println(Math.pow(5, 0.5));
    
    System.out.println(Math.ceil(5.1));
    System.out.println(Math.ceil(5.0));
    System.out.println(Math.ceil(-3.2));
    System.out.println(Math.ceil(-7.0));
    
    System.out.println(Math.floor(5.9));
    System.out.println(Math.floor(5.0));
    System.out.println(Math.floor(-3.9));
    System.out.println(Math.floor(-7.0));
    
    System.out.println(Math.rint(5.49));
    System.out.println(Math.rint(5.5));
    System.out.println(Math.rint(5.51));
    
    System.out.println(Math.round(5.49));
    System.out.println(Math.round(5.50));
    System.out.println(Math.round(5.51));
    
  }
  
  /**
   * 角度转弧度
   * @param a   角度[0, 360)
   * @return    弧度[0, 2*pi)
   */
  public static double angleToRadian(double a) {
    return a/360*2*Math.PI;
  }
}
