package liang05;

import java.util.Scanner;

public class Test13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please input a number: ");
    int a = input.nextInt();
    
    System.out.println("number\tsum");
    for (int i = 1; i <= a; i++) {
      pirintSum(i);
    }
    
    input.close();
  }
  
  public static void pirintSum(int n) {
    double sum = 0;
    for (int i = n; i >= 1; i--) {
      sum += 1.0*i/(i+1);
    }
    System.out.printf("%d\t%.4f\n", n, sum);
  }
}
