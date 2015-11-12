package liang08;

import java.util.Scanner;

public class Demo_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please input a string: ");
    String str = input.nextLine();
    char[] chars = str.toCharArray();
    if (isPalindrom(chars)) {
      System.out.println("true.");
    }
    else {
      System.out.println("false");
    }
    
    input.close();
  }
  
  public static boolean isPalindrom(char[] chars) {
    for (int i = 0; i <= chars.length/2; i++) {
      if (chars[i] != chars[chars.length-1-i]) {
        return false;
      }
    }
    return true;
  }
}
