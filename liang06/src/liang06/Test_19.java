package liang06;

import java.util.Scanner;

public class Test_19 {
  public static void main(String[] args) {
    String[] names = new String[100];
    double[] scores = new double[100];
    System.out.print("please input the number of students: ");
    Scanner input = new Scanner(System.in);
    int count = input.nextInt();
    for (int i = 0; i < count; i++) {
      System.out.printf("请输入第 %d 名学生的姓名和成绩\n姓名：", i+1);
      names[i] = input.next();
      System.out.print("成绩：");
      scores[i] = input.nextDouble();
    }
    maxToMin(scores, names, count);
    for (int i = 0; i < count; i++) {
      System.out.printf("name: %s, score: %f.\n", names[i], scores[i]);
    }
    
    input.close();
  }
  
  public static void maxToMin(double[] a, String[] b, int count) {
    for (int i = 0; i < count; i++) {
      double max = a[i];
      int index = i;
      for (int j = i+1; j < count; j++) {
        if (a[j] > max) {
          max = a[j];
          index = j;
        }
      }
      if (index != i) {
        double temp = a[i];
        a[i] = a[index];
        a[index] = temp;
        
        String s = b[i];
        b[i] = b[index];
        b[index] = s;
      }
    }
  }
  
}
