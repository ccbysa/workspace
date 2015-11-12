package liang06;

public class Test_23 {
  public static void main(String[] args) {
    boolean[] boxes = new boolean[100];
    java.util.Arrays.fill(boxes, false);//false: closed; true: opened.
    System.out.println(boxes[0]);
    System.out.println(!boxes[0]);
    printArray(boxes);
    
    for (int i = 0; i < 100; i++) {
      for (int j = i; j < boxes.length; j++) {
        //System.out.println("old: "+boxes[i]);
        boxes[j] = !boxes[j];
        //System.out.println("new: "+boxes[i]);
      }
    }
    printArray(boxes);
    printArray(boxes, true);
  }
  
  public static void printArray(boolean[] a) {
    System.out.println("********************************************");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]+"\t");
      if (i%10 == 9) {
        System.out.println();
      }
    }
  }

  public static void printArray(boolean[] a, boolean b) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == b) {
        System.out.printf("%d\t", i+1);
        count++;
        if (count%10 == 0) {
          System.out.println();
        }
      }
    }
  }

}
