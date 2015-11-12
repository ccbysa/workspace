package liang06;

public class Demo_5 {
  public static void main(String[] args) {
    int[] a = new int[10];
    int[] b = new int[10];
    a = b;
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]+" ");
    }
    System.out.println();
    
    for (int i = 0; i < b.length; i++) {
      b[i] = i;
    }
    
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]+" ");
    }
    System.out.println();
    
    for (int i = 0; i < b.length; i++) {
      System.out.print(b[i]+" ");
    }
    System.out.println();
    
    System.out.println(a);
    System.out.println(b);
  }
}
