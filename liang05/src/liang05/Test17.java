package liang05;

import java.util.Scanner;

public class Test17 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("please input a nuber: ");
    int n = input.nextInt();
    printMatrix(n);
    
    input.close();
  }
  
  public static void printMatrix(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(getRandomBinary()+" ");
      }
      System.out.println();
    }
  }
  
  public static int getRandomBinary() {
    return (int)(Math.random()+0.5);
  }

  
}
