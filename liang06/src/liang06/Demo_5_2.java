package liang06;

public class Demo_5_2 {
  public static void main(String[] args) {
    int[] a = new int[10];
    int[] b = new int[10];
    
    System.out.print("a: ");
    for (int i : a) {
      System.out.print(i+" ");
    }
    System.out.println();
    
    System.out.print("b: ");
    for (int i : b) {
      System.out.print(i+" ");
    }
    System.out.println();
    
    for (int i = 0; i < a.length; i++) {
      a[i] = i;
    }
    System.out.print("a: ");
    for (int i : a) {
      System.out.print(i+" ");
    }
    System.out.println();
    
    System.out.print("b: ");
    for (int i : b) {
      System.out.print(i+" ");
    }
    System.out.println();
    
    for (int i = 0; i < b.length; i++) {
      b[i] = a[i];
    }
    
    System.out.print("a: ");
    for (int i : a) {
      System.out.print(i+" ");
    }
    System.out.println();
    
    System.out.print("b: ");
    for (int i : b) {
      System.out.print(i+" ");
    }
    System.out.println();
    
    for (int i = 0; i < a.length; i++) {
      a[i] = i*2;
    }
    
    System.out.print("a: ");
    for (int i : a) {
      System.out.print(i+" ");
    }
    System.out.println();
    
    System.out.print("b: ");
    for (int i : b) {
      System.out.print(i+" ");
    }
    System.out.println();
    
  }
}
