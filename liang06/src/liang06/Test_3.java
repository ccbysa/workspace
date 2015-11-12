package liang06;

import java.util.Scanner;

public class Test_3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[100];
    System.out.print("please numbers between 1 and 100, end with 0: ");
    
    int num = input.nextInt();
    while (num != 0) {
      numbers[num-1]++;
      num = input.nextInt();
    }
    
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] != 0) {
        System.out.printf("%d occurs %d time", i+1, numbers[i]);
        if (numbers[i]>1) {
          System.out.print("s");
        }
        System.out.println(".");
      }
    }
    
    
    input.close();
  }
}
