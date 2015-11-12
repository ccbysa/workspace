package liang06;

public class Demo_10 {
  public static void main(String[] args) {
    int[] a = {2, 9, 5, 4, 8, 1, 6};
    for (int i = 0; i < a.length; i++) {
      for (int j = i+1; j < a.length; j++) {
        if (a[i]>a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
      System.out.printf("%d time.\n", i+1);
      for (int k : a) {
        System.out.print(k+" ");
      }
      System.out.println();
    }
  }
}
