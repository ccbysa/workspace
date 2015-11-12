package liang06;

import java.util.Scanner;

public class Test_5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("please input 10 numbers: ");
    int[] numberCount = new int[10];
    
    int pointer = 0;
    for (; ;) {
      int num = input.nextInt();
      if (num == 0) {
        break;
      }
      if (isContain(numberCount, pointer, num) == false) {
        numberCount[pointer] = num;
        pointer++;
      }
    }
    
    for (int i = 0; i < pointer; i++) {
      System.out.print(numberCount[i]+" ");
    }
    System.out.println();
    
    input.close();
  }
  
  public static boolean isContain(int[] a, int len, int num) {
   for (int i = 0; i < len; i++) {
      if (num == a[i]) {
        return true;
      }
    }
    return false;
  }
  
}
