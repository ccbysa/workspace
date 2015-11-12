package liang07;

import java.util.Scanner;

public class Demo_1 {
  public static void main(String[] args) {
    int[][] a = new int[3][4];
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter 3 rows and 4 columns:");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        a[i][j] = input.nextInt();
      }
    }
    System.out.println("sum = "+ sum(a));
    input.close();
  }
  
  public static int sum(int[][] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        sum += a[i][j];
      }
    }
    return sum;
  }
}
