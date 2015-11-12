package liang06;

public class Test_12 {
  public static void main(String[] args) {
    int[] list = new int[10];
    for (int i = 0; i < list.length; i++) {
      list[i] = i*2;
    }
    
    list = reverse(list);
    for (int i : list) {
      System.out.print(i+" ");
    }
    System.out.println();
  }
  
  public static int[] reverse(int[] a) {
    int[] b = new int[a.length];
    for (int i = 0; i < b.length; i++) {
      b[i] = a[a.length-i-1];
    }
    
    return b;
  }  
}
