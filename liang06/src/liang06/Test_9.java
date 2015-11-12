package liang06;

public class Test_9 {
  public static void main(String[] args) {
    double[] numbers = {1, 3, 5, -1, 3, 2, -1, 7};
    System.out.println(min(numbers));
    System.out.println(numbers[min(numbers)]);
  }
  
  public static int min(double[] a) {
    int minIndex = 0;
    
    for (int i = 1; i < a.length; i++) {
      if (a[minIndex] > a[i]) {
       minIndex = i;
      }
    }
    return minIndex;
  }
}
