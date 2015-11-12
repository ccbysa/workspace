package liang05;

import java.util.Scanner;

public class Test19 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please input three nunbers: ");
    double s1 = input.nextDouble();
    double s2 = input.nextDouble();
    double s3 = input.nextDouble();
    
    if (testValid(s1, s2, s3)) {
      System.out.println("The triangle is valid.");
      System.out.println(triangleSquare(s1, s2, s3));
    }
    else {
      System.out.println("The triangle is invalid.");
    }
    
    input.close();
  }
  
  public static boolean testValid(double s1, double s2, double s3) {
    if ((s1+s2)>s3 && (s2+s3)>s1 && (s1+s3)>s2) {
      return true;
    }
    
    return false;
  }

  public static double triangleSquare(double s1, double s2, double s3) {
    double s = (s1+s2+s3)/2;
    
    return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
  }
  
}
