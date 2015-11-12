package liang05;

import java.util.Scanner;

public class Demo_8 {
  public static void main(String[] args) {
    Scanner name = new Scanner(System.in);
    System.out.print("Please input a integer: ");
    int number = name.nextInt();
    System.out.printf("%d = 0x%s", number, toHexString(number));
    
    name.close();
  }
  
  public static String toHexString(int n) {
    String hex = "";
    while (n != 0) {
      hex = (hexToChar(n%16))+hex;
      n = n/16;
    }
    
    return hex;
  }
  
  public static char hexToChar(int a) {
    if (a>9) {
      return (char)(a-10+'A');
    }
    else {
      return (char)(a+'0');
    }
  }
  
}
