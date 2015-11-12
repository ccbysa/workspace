package liang05;

public class Test10 {
  public static void main(String[] args) {
    int numberPerLine = 10;
    int count = 0;
    
    for (int i = 1; i <= 10000; i++) {
      if (isPrime(i)) {
        System.out.print(i+"\t");
        count ++;
        if (count>0 && count%numberPerLine == 0) {
          System.out.println();
        }
      }
      
    }
  }
  
  public static boolean isPrime(int number) {
    if (number == 1) {
      return false;
    }
    else {
      for (int i = 2; i <= number/2; i++) {
        if (number%i == 0) {
          return false;
        }
      }
      
      return true;
    }
  }
}
