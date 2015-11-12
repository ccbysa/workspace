package liang06;

public class Demo_7 {
  public static void main(String[] args) {
    int[] count = new int[26];
    for (int i = 0; i < 1000000; i++) {
      count[(int)(getRandomChar()-'A')]++;
    }
    
    for (int i = 0; i < count.length; i++) {
      System.out.printf("%c: %d, %.2f%%\n", ('A'+i), count[i], 1.0*count[i]/10000);
    }
    System.out.println();
    
    int sum = 0;
    for (int i = 0; i < count.length; i++) {
      sum += count[i];
    }
    System.out.println("sum = "+sum);
    
    System.out.println(1.0/26);
  }
  
  public static char getRandomChar() {
    return (char)('A'+Math.random()*26);
  }
}
