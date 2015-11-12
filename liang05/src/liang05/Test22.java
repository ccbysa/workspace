package liang05;

import java.util.Scanner;

public class Test22 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("input a number: ");
    double number = input.nextDouble();
    double lastGuess = 1;
    double newGuess = 1;
    
    do {
      lastGuess = newGuess;
      newGuess = (lastGuess+number/lastGuess)/2;
    } while (Math.abs(newGuess-lastGuess)>10e-4);
    System.out.println(newGuess);
    
    input.close();
  }
}
