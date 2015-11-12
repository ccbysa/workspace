package liang08;

import java.util.Random;

public class Test_4 {
  public static void main(String[] args) {
    Random r1 = new Random(1000);
    for (int i = 0; i < 50; i++) {
      System.out.print(r1.nextInt(100)+"\t");
      if (i%10 == 9) {
        System.out.println();
      }
    }
  }
}
