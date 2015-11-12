package liang05;

import java.util.Scanner;

public class Demo_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double score = 0;
    do {
      System.out.print("Please input your score: ");
      score = input.nextDouble();
      if ((int)score == 0) {
        System.out.println("soft exit.");
        System.exit(0);
      }
      System.out.println("Your score is "+score+", your score's grade is : "
                          +printGrade((int)score));
    } while ((int)score != 0);
    System.out.println("soft exit.");
    
    
    input.close();
  }
  public static char printGrade(int score) {
    switch (score/10) {
      case 10:
      case 9:
        return 'A';       
      case 8:
        return 'B';      
      case 7:
        return 'C';      
      case 6:
        return 'D';
        
      default:
        return 'E';       
    }
  }
}
