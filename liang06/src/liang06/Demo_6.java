package liang06;

public class Demo_6 {
  public static void main(String[] args) {
    int[] a = new int[10];
    int[] b = new int[10];
    
    for (int i = 0; i < a.length; i++) {
      a[i] = i*2;
    }
    
    System.out.print("a: ");
    for (int i : a) {
      System.out.print(i+" ");
    }
    System.out.println();
    
    b = reverse(a);
    System.out.print("b: ");
    for (int i : b) {
      System.out.print(i+" ");
    }
    System.out.println();
  }
  
  public static int[] reverse(int[] a) {
    int[] result = new int[a.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = a[a.length-1-i];
    }
    
    return result;
  }
  
}
