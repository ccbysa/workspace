package liang06;

public class Test_15 {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]+" ");
    }
    System.out.println();
    
    a = eliminateDuplicates(a);
    for (int i = 0; i < a.length; i++) {
      if (a[i] == -1) {
        break;
      }
      System.out.print(a[i]+" ");
    }
    System.out.println();
  }
  
  public static int[] eliminateDuplicates(int[] number) {
    int[] newList = new int[number.length];
    java.util.Arrays.fill(newList, -1);
    newList[0] = number[0];
    int count = 1;
    
    for (int i = 1; i < number.length-1; i++) {
      int j;
      for (j = 0; j < i; j++) {
        if (number[i] == number[j]) {
          break;
        }
      }
      if (j == i) {
        newList[count] = number[i];
        count++;
      }
      
    }
    
    return newList;
  }
  
}
