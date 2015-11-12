package liang06;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Test_30 {
  public static void main(String[] args) {
    int[] a = new int[10];
    java.util.Arrays.fill(a, -1);
    Scanner input = new Scanner(System.in);
    System.out.print("Please input a set of numbers (end with 0): ");
    int num = input.nextInt();
    for (int i = 0; (i < a.length) && (num != 0); i++) {
      a[i] = num;
      num = input.nextInt();
    }
    
    if (isContinuous(a, 4)) {
      System.out.println("continuous four.");
    }
    else {
      System.out.println("no continuous four.");
    }
    
    printArray(a);
    
    input.close();
  }
  
  public static void printArray(int[] a) {
    for (int i : a) {
      System.out.print(i+"  ");
    }
    System.out.println();
  }

  public static boolean isContinuous(int[] a, int num) {
    int count = 0;
    for (int i = 0; i < a.length-1; i++) {
      if (a[i] == -1) {
        return false;
      }
      if (a[i] == a[i+1]) {
        count++;
        if (count == num-1) {
          return true;
        }
      }
      else {
        count = 0;
      }
    }
    
    return false;
  }
  
}
