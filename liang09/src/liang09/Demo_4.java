package liang09;

import java.util.Scanner;

public class Demo_4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("please input something: ");
    String str = input.nextLine();
    System.out.println(countLetter(str.toLowerCase()));
    
    input.close();
  }
  
  public static int countLetter(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      Character character = new Character(s.charAt(i));
      if (Character.isLowerCase(character)) {
        count++;
      }
    }
    return count;
  }
}
