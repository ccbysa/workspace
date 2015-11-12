package liang06;

public class Test_18 {
  public static void main(String[] args) {
    double[] a = {6.0, 4,4, 1.9, 2.9, 3.4, 2.9, 3.5};
    printArray(a);
    bubbleSort(a);
    printArray(a);
    
  }
  
  public static void printArray(double[] a) {
    for (double d : a) {
      System.out.print(d+" ");
    }
    System.out.println();
  }
  
  public static void bubbleSort(double[] a) {
    for (int i = 0; i < a.length-1; i++) {
      for (int j = 0; j < a.length-i-1; j++) {
        if (a[j] < a[j+1]) {
          double temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
        }
      }
      printArray(a);
    }
  }
  
}
