package liang05;

public class Demo_7 {
  public static void main(String[] args) {
    int count = 0;
    for (int i = 1; i <= 10000; i++) {
      if (isPrime(i)) {
        System.out.printf("%4d\t", i);
        count++;
        if (count%10 == 0) {
          System.out.println();
        }
      }
    }
  }
  
  public static boolean isPrime(int n) {
    if (n == 1) {
      return false;
    }
    for (int i = 2; i <= n/2; i++) {
      if (n%i == 0) {
        return false;
      }
    }
    
    return true;
  }
}
