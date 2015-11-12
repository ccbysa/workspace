package liang07;

import java.util.Scanner;

public class Test_7 {
  public static void main(String[] args) {
    int[][] a = new int[3][3];
    Scanner input = new Scanner(System.in);
    System.out.print("Please input a number(0~511):");
    int num = input.nextInt();
    
    for (int i = a.length-1; i >= 0; i--) {
      for (int j = a[i].length-1; j >= 0; j--) {
        a[i][j] = num%2;
        num = num/2;
      }     
    }
    printArray(a);
    
    input.close();
  }
  
  public static void printArray(int[][] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if (a[i][j] == 1) {
          System.out.print("T ");
        }
        else {
          System.out.print("H ");
        }
      }
      System.out.println();
    }
  }
  
}
