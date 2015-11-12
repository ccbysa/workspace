package liang05;

import java.util.Scanner;

public class Test21 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("请输入10个数：");
    double sum = 0;
    double sum1 = 0;
    //double x;
    
    for (int j = 0; j < 10; j++) {
      double x = input.nextDouble();
      sum += x;
      sum1 += Math.pow(x, 2); 
    } 
    
    System.out.println("sum = "+sum);
    System.out.println("average = "+sum/10);
    System.out.println("Standard deviation: "+Math.sqrt((sum1-Math.pow(sum, 2)/10)/9));
    
    input.close();
  }
}
