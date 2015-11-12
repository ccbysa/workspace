package liang06;

public class Demo_9 {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int index = linerSearch(a, 120);
    System.out.println(index);
  }
  
  public static int linerSearch(int[] a, int num) {
    int low = 0;
    int high = a.length-1;
    int middle = (low+high)/2;
    
    int count = 0;
    while (high >= low) {
      count++;
      System.out.println("count= "+count);
      System.out.printf("low = %d, high = %d, middle = %d\n", low, high, middle);
      if (num > a[middle]) {
        low = middle+1;       
      }
      else if (num < a[middle]) {
        high = middle-1;
      }
      else {
        return middle;
      }     
      middle = (low+high)/2;
      System.out.printf("after: low = %d, high = %d, middle = %d\n", low, high, middle);
      
    }
    return -low-1;
  }
}
