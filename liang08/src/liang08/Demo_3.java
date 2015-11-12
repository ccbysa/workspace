package liang08;

import java.util.Scanner;

public class Demo_3 {
  public static void main(String[] args) {
    System.out.print("please input a string:");
    Scanner input = new Scanner(System.in);
    String s = input.next();
    System.out.println(hexToDicemal(s));
    input.close();
  }
  
  public static int hexToDicemal(String s) {
    int decimalValue = 0;
    for (int i = 0; i < s.length(); i++) {
      decimalValue = decimalValue*16+charToDecimal(s.charAt(i));
    }
    return decimalValue;
  }
  
  public static int charToDecimal(char ch) {
    if (ch <= '9') {
      return (int)(ch-'0');
    }
    else if (ch <= 'F') {
      return (int)(ch-'A')+10;
    }
    else {
      return (int)(ch-'a')+10;
    }
  }
}
