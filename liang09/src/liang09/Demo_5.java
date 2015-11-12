package liang09;

import java.util.Scanner;

public class Demo_5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("please input something: ");
    String str = input.nextLine();
    int[] cnt = countLetter(str.toLowerCase());
    for (int i = 0; i < cnt.length; i++) {
      if (cnt[i] != 0) {
        System.out.printf("%c: %d times.\n", ('a'+i), cnt[i]);
      }
    }
    
    input.close();
  }
  
  public static int[] countLetter(String s) {
    int[] counts = new int[26];
    for (int i = 0; i < s.length(); i++) {
      if (Character.isLowerCase(s.charAt(i))) {
        counts[s.charAt(i)-'a']++;
      }
    }
    return counts;
  }
  
}
