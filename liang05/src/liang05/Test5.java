package liang05;

import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    Scanner name = new Scanner(System.in);
    System.out.print("Please input the first number: ");
    int num1 = name.nextInt();
    System.out.print("Please input the second number: ");
    int num2 = name.nextInt();
    System.out.print("Please input the third number: ");
    int num3 = name.nextInt();
    
    displaySortedNumber(num1, num2, num3);
    
    name.close();
  }
  
  public static void displaySortedNumber(int n1, int n2, int n3) {
    int tempMax = max(n1, n2);
    int tempMin = min(n1, n2);
    
    if (n3 < tempMin) {
      System.out.printf("%d\t%d\t%d.", n3, tempMin, tempMax);
    }
    else if (n3 > tempMax) {
      System.out.printf("%d\t%d\t%d.", tempMin, tempMax, n3);
    }
    else {
      System.out.printf("%d\t%d\t%d.", tempMin, n3, tempMax);
    }
  }
  
  public static int max(int n1, int n2) {
    return (n1 > n2)? n1:n2;
  }
  
  public static int min(int n1, int n2) {
    return (n1 < n2)? n1:n2;
  }
    
}
