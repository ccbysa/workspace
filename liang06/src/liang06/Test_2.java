package liang06;

import java.util.Scanner;

public class Test_2 {
  public static void main(String[] args) {
    final int COUNT = 7;
    int[] numbers = new int[COUNT];
    Scanner input = new Scanner(System.in);
    
    System.out.println("please input 10 numbers: ");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextInt();
    }
    
    for (int i : numbers) {
      System.out.print(i+" ");
    }
    System.out.println();
    
    reverse(numbers);
    for (int i : numbers) {
      System.out.print(i+" ");
    }
    System.out.println();
    
    input.close();
  }
  
  public static void reverse(int[] a) {
    for (int i = 0; i < a.length/2; i++) {
      int temp = a[i];
      a[i] = a[a.length-1-i];
      a[a.length-1-i] = temp;
    }
  }
  
}
