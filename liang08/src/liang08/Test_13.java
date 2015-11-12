package liang08;

import java.util.Scanner;

public class Test_13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("please input the array's rows and columns.");
    System.out.print("Rows: ");
    int row = input.nextInt();
    System.out.print("Columns: ");
    int column = input.nextInt();
    int[][] a = new int[row][column];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        a[i][j] = input.nextInt();
      }
    }
    Location.localLargest(a);
    System.out.println(Location.maxMatrix);
    System.out.println(Location.row);
    System.out.println(Location.column);
    
    
    input.close();
  }
}

class Location {
  public static int row;
  public static int column;
  public static int maxMatrix;
  
  public static void localLargest(int[][] a) {
    Location.maxMatrix = a[0][0];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] > Location.maxMatrix) {
          Location.maxMatrix = a[i][j];
          Location.row = i;
          Location.column = j;
        }
      }
    }
    //return new Location();
  }
}