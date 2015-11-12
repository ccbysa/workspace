package liang06;

public class Demo_8 {
  public static void main(String[] args) {
    printMax(new double[] {5, 3, 25, 4,1});
    
    double[] a = new double[26];
     for (int i = 0; i < a.length; i++) {
      a[i] = (int)('a'+Math.random()*26);
    }
    printMax(a);
    printMax();
    printMax(1, 5, 2);
  }
  public static void printMax(double... array) {
    double result = 0;
    if (array.length == 0) {
      System.out.println("no parameter.");
    }
    else {
      
      for (int i = 0; i < array.length; i++) {
        if (array[i]>result) {
          result = array[i];
        }
      }
      System.err.println("result = "+result);
    }
  }
}
