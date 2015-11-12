package liang06;

public class Demo_13 {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    for (int i : a) {
      System.out.print(i+" ");
    }
    System.out.println();
    
    reverse(a);
    for (int i : a) {
      System.out.print(i+" ");
    }
    System.out.println();
    
  }
  
  public static void reverse(int[] a) {
    for (int i : a) {
      System.out.print(i+" ");
    }
    System.out.println();
    
    int[] b = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      b[i] = a[a.length-i-1];
    }
    
    for (int i : b) {
      System.out.print(i+" ");
    }
    System.out.println();
    a = b;
  }
  
}
