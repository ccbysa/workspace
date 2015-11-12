package liang05;

import java.util.Scanner;

public class Test6 {
  public static void main(String[] args) {
    Scanner name = new Scanner(System.in);
    System.out.print("Plesase input a number: ");
    int number = name.nextInt();
    displayPattern(number);
    
    name.close();
  }
  
  public static void displayPattern(int n) {
    for (int i = 1; i <= n; i++) {
      displayLine(i, n);
    }
  }
  
  /**
   * 显示1行
   * @param a      第a行
   * @param b      共b行
   */
  public static void displayLine(int a, int b) {
    for (int i = 1; i <= (b-a); i++) {
      System.out.print("\t");
    }
    for (int i = a; i >= 1; i--) {
      System.out.print(i+"\t");
    }
    System.out.println();
  }
  
}
