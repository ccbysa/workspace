package liang09;

import java.util.Scanner;

public class Demo_7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("please input something: ");
    String str = input.nextLine();
    String  temp1 = filterLetterAndDigit(str);
    System.out.println(temp1);
    if (temp1.equals(reverseString(temp1))) {
      System.out.println("true.");
    }
    else {
      System.out.println("false.");
    }
    
    input.close();
  }
  
  public static String filterLetterAndDigit(String s) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (isLowCaseLetter(s.toLowerCase().charAt(i))) {
        stringBuilder.append(s.charAt(i));
      }
      if (isDigit(s.charAt(i))) {
        stringBuilder.append(s.charAt(i));
      }
    }
    return stringBuilder.toString();
  }
  
  public static boolean isLowCaseLetter(char ch) {
    if (ch >= 'a' && ch <= 'z') {
      return true;
    }
    return false;
  }
  
  public static boolean isDigit(char ch) {
    if (ch >= '0' && ch <= '9') {
      return true;
    }
    return false;
  }
  
  public static String reverseString(String s) {
    return new StringBuilder(s).reverse().toString();
  }
}
