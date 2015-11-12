package liang06;

public class Demo_5_3 {
  public static void main(String[] args) {
    int[] a = new int[10];
    int[] b = new int[10];
    
    System.arraycopy(a, 0, b, 0, a.length);
    
    System.out.println(a);
    System.out.println(b);
    
    System.out.print("a1: ");
    for (int i : a) {
      System.out.print(a[i]+" ");
    }
    System.out.println();
    
    System.out.print("b1: ");
    for (int i : b) {
      System.out.print(b[i]+" ");
    }
    System.out.println();
    
    for (int i = 0; i < a.length; i++) {
      a[i] = i*2;
    }
    
    System.out.println("a2 :");
    for (int i : a) {
      System.out.print(i+" ");
    }
    System.out.println();
    
    System.out.print("b2: ");
    for (int i : b) {
      System.out.print(i+" ");
    }
    System.out.println();
    
    System.arraycopy(a, 2, b, 0, a.length-2);
    
    System.out.println("a3 :");
    for (int i : a) {
      System.out.print(i+" ");
    }
    System.out.println();
    
    System.out.print("b3: ");
    for (int i : b) {
      System.out.print(i+" ");
    }
    System.out.println();
    
  }
}
