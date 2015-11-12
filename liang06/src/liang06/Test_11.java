package liang06;

import java.util.Scanner;

public class Test_11 {
  public static void main(String[] args) {
    final int COUNT = 10;
    double[] numbers = new double[COUNT];
    Scanner input = new Scanner(System.in);
    
    for (int i = 0; i < COUNT; i++) {
      System.out.printf("请输入第 %d 个数字：", i+1);
      numbers[i] = input.nextDouble();
    }
    System.out.println(mean(numbers));
    System.out.println(deviation(numbers));
    
    input.close();
  }
  
  public static double mean(double[] a) {
    double sum = a[0];
    for (int i = 1; i < a.length; i++) {
      sum += a[i];
    }
    
    return sum/a.length;
  }
  
  public static double meanSquare(double[] a, double avg) {
    double sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += Math.pow(a[i]-avg, 2);
    }
    
    return sum;
  }
  
  public static double deviation(double[] a) {
    double avg = mean(a);
    double meanAvg = meanSquare(a, avg);
    
    return Math.sqrt((meanAvg)/(a.length-1));
  }
}
