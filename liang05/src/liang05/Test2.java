package liang05;

import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {
    Scanner name = new Scanner(System.in);
    System.out.print("Please input a number: ");
    int number = name.nextInt();
    int sum = 0;
    
    while (number != 0) {
      sum += number%10;
      number /= 10;
    }
    
    System.out.println("sum = "+sum);
    
    name.close();
  }
}
