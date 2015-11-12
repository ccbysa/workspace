package liang05;

import java.util.Scanner;

public class Demo_6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please input the 1st number: ");
    int firstNumber = input.nextInt();
    System.out.print("Please input the 2ed number: ");
    int secondNumber = input.nextInt();
    
    System.out.printf("%d 和 %d 的最大公约数是: %d.", firstNumber, secondNumber, getCommonDivisor(firstNumber, secondNumber));
    
    
    input.close();
  }
  
  public static int getCommonDivisor(int n1, int n2) {
    int gcd = 1;
    for (int i = 1; i <= ((n1>n2)? n2:n1); i++) {
      if (n1%i==0 && n2%i==0) {
        gcd = i;
      }
    }
    return gcd;
  }
}
