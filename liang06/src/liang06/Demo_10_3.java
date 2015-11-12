package liang06;

public class Demo_10_3 {
  public static void main(String[] args) {
    int[] a = {2, 9, 5, 4, 8, 1, 6};
    
    for (int i = 0; i < a.length-1; i++) {
      arraySort(a, i+1);
      System.out.println((i+1)+" times");
      printArray(a);
    }
    
  }
  public static void arraySort(int[] a, int index) {
    int temp = 0;
    for (int i = 0; i < index+1; i++) {
      if (a[index] < a[i]) {
        temp = a[index];    // for temp saving a[index]
        for (int j = index-1; j >= i; j--) {    // move right 1 unit.
          a[j+1] = a[j];
        }
        a[i] = temp;  //a[i] should be a[index]
      }
    }
  }

  public static void printArray(int[] a) {
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]+" ");
    }
    System.out.println();
  }
  
}
