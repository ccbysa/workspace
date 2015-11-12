package liang06;

public class Demo_10_2 {
  public static void main(String[] args) {
    int[] a = {62, 59, 45, 34, 28, 11, 6};
    for (int i = 0; i < a.length-1; i++) {
      int smallestIndex = i;
      for (int j = i+1; j < a.length; j++) {
        if (a[smallestIndex] > a[j]) {
          smallestIndex = j;
        }
      }
      if (smallestIndex != i) {
        int temp = a[i];
        a[i] = a[smallestIndex];
        a[smallestIndex] = temp;
      }

      System.out.printf("%d time\n", i+1);
      for (int j : a) {
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}
