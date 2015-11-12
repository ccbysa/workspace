package liang07;

import java.util.Scanner;

public class Test_13 {
  public static void main(String[] args) {
    int[][] a = new int[2][1];
    Scanner input = new Scanner(System.in);
    System.out.print("please input rows:");
    a[0][0] = input.nextInt();
    System.out.print("please input columns:");
    a[1][0] = input.nextInt();
    int[][] numbers = new int[a[0][0]][a[1][0]];
    
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length; j++) {
        numbers[i][j] = input.nextInt();
      }
    }
    
    int maxRow = 0;
    int maxCol = 0;
    int max = 0;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length; j++) {
        if (numbers[i][j]>max) {
          max = numbers[i][j];
          maxRow = i;
          maxCol = j;
        }
      }
    }
    
    System.out.println("row = "+maxRow);
    System.out.println("col = "+maxCol);
    System.out.println("max = "+max);
    
    input.close();
  }
}
