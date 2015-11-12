package liang05;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    Scanner name = new Scanner(System.in);
    System.out.print("Please input a number：");
    int number = name.nextInt();
    
    System.out.println("reverse: "+ reverse(number));
    
    if (isPalindrome(number)) {
      System.out.println("This number is a palindrome number.");
    }
    else {
      System.out.println("This number is not a palindrome number.");
    }
    
    name.close();
  }
  
  public static int reverse(int a) {
    int sum = 0;
    
    while (a != 0) {
      sum *= 10;
      sum += (a%10);
      a /= 10;
    }
    
    return sum;
  }

  public static boolean isPalindrome(int num) {
    if (num == reverse(num)) {
      return true;
    }
    return false;
  }
  
}
