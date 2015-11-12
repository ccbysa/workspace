package liang06;

import java.util.Scanner;

public class Test_1 {
  public static void main(String[] args) {
    double[] scores = new double[10];
    Scanner input = new Scanner(System.in);
    java.util.Arrays.fill(scores, -1);
    System.out.print("Please input students' score: ");
    for (int i = 0; i < scores.length; i++) {
      double s = input.nextDouble();
      if (s <= 0) {
        break;
      }
      scores[i] = s;
    }
    for (int j = 0; j < scores.length; j++) {
      System.out.print(scores[j]+ " ");
    }
    System.out.println();
    
    double max = scores[0];
    for (int i = 1; scores[i]>0; i++) {
      if (scores[i]>max) {
        max = scores[i];
      }
    }
    System.out.println("max = "+max);
    for (int i = 0; scores[i]>0; i++) {
      System.out.printf("score: %f, grade: %c.\n", scores[i], getGrade(scores[i], max));
    }
    
    input.close();
  }
  
  public static char getGrade(double score, double max) {
    char ch = ' ';
    switch ((int)(max-score)/10) {
      case 0:
        ch = 'A';
        break;
      case 1:
        ch = 'B';
        break;
      case 2:
        ch = 'C';
        break;
      case 3:
        ch = 'D';
        break;
        
      default:
        ch = 'E';
        break;
    }
    return ch;
  }
  
}
