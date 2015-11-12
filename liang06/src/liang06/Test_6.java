package liang06;

public class Test_6 {
  public static void main(String[] args) {
    final int COUNT = 50;
    int[] primes = new int[COUNT];
    
    int i = 0;
    
    for (int j = 1; ; j++) {
      if (isPrime(j)) {
        primes[i] = j;
        i++;
        if (i == COUNT) {
          break;
        }
      }
    }
    
    for (int j = 0; j < primes.length; j++) {
      System.out.print(primes[j]+"\t");
      if (j%10 == 9) {
        System.out.println();
      }
    }
    
  }
  
  public static boolean isPrime(int n) {
    if (n == 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n%i == 0) {
        return false;
      }
    }
    return true;
  }
  
}
