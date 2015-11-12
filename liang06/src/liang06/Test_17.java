package liang06;

public class Test_17 {
  public static void main(String[] args) {
    int[] a = {10, 9, 8, 7, 6, 2, 5, 4, 1, 3};
    
    printArray(a);
    minToMax(a);
    printArray(a);
  }
  
  public static int[] minToMax(int[] a) {
    for (int i = a.length-1; i >= 0; i--) {
      int index = i;
      int max = a[i];
      
      for (int j = 0; j < i; j++) {//求出最大值的index
        if (a[j]>max) {
          max = a[j];
          index = j;
        }
      }
      System.out.println("index = "+index);
      if (i != index) {
        int temp = a[i];
        a[i] = a[index];
        a[index] = temp;
      }
      printArray(a);
    }
    return a;
  }
  
  public static void printArray(int[] a) {
    for (int i : a) {
      System.out.print(i+" ");
    }
    System.out.println();
  }
  
}
