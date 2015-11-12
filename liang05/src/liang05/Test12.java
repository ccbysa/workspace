package liang05;

import java.util.Scanner;

public class Test12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please input a number: ");
    int a = input.nextInt();
    printChars('0', 'z', a);
    
    input.close();
  }
  
  public static void printChars(char ch1, char ch2, int numberPerLine) {
    int count = 0;
    for (char i = ch1; i <= ch2; i++) {
      System.out.print(i+"\t");
      count++;
      if (count%numberPerLine == 0) {
        System.out.println();
      }
    }
  }
  
}
