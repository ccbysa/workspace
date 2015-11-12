package liang06;

public class Test_16 {
  public static void main(String[] args) {
    final int COUNT = 100000;
    int[] a = new int[COUNT];
    for (int i = 0; i < COUNT; i++) {
      a[i] = (int)(Math.random()*COUNT);
    }
    
    long startTime = System.currentTimeMillis();
    int index = linerSearch(a, (int)(Math.random()*COUNT));
    long endTime = System.currentTimeMillis();
    System.out.println("index: "+index);
    System.out.println("time: "+(endTime-startTime));
    
    java.util.Arrays.sort(a);
    startTime = System.currentTimeMillis();
    index = binarySearch(a, (int)(Math.random()*COUNT));
    endTime = System.currentTimeMillis();
    System.out.println("index: "+index);
    System.out.println("time: "+(endTime-startTime));
    
  }
  
  public static int linerSearch(int[] a, int num) {
    System.out.printf("Searching for %d...\n", num);
    for (int i = 0; i < a.length; i++) {
      if (num == a[i]) {
        return i;
      }
    }
    
    return -1;
  }

  public static int binarySearch(int[] a, int num) {
    int low = 0;
    int high = a.length;
   while (high > low) {
     int middle = (low+high)/2;
     if (num > a[middle]) {
       low = middle+1;
    }
    else if (a[middle] > num) {
      high = middle-1;
    }
    else {
      return middle;
    }
  }
   return -low-1;
 } 
}
