package liang06;

public class Test_21 {
  public static void main(String[] args) {
    int[] a = new int[7];
    int[] times = new int[8];
    
    for (int j = 0; j < 50; j++) {
      int count = 0;
      for (int i = 0; i < a.length; i++) {
        a[i] = (int)(Math.random()+0.5);
      }
      
      for (int i = 0; i < a.length; i++) {
        if (a[i] == 0) {
          System.out.print("L");
        }
        else {
          count++;
          System.out.print("R");
        }
      }
      System.out.println();
      times[count]++;
    }
    /*
    for (int i = 0; i < times.length; i++) {
      System.out.println(times[i]);
    }*/
    
    int max = times[0];
    for (int i = 1; i < times.length; i++) {
      if (times[i] > max) {
        max = times[i];
      }
    }
    int cnt = max;
    for (int i = 0; i < max; i++) {
      for (int j = 0; j < times.length; j++) {
        if (times[j] == cnt) {
          System.out.print("| 0 ");
          times[j]--;
        }
        else {
          System.out.print("|   ");
          
        }
      }
      cnt--;
      System.out.println("|");
    }
    
  }
}
