package liang06;

public class Test_8 {
  public static void main(String[] args) {
    System.out.println(average(new int[] {1, 2, 3, 3, 5}));
    System.out.println(average(new double[] {1.0, 2, 3.0, 3, 5}));
  }
  
  public static int average(int[] array) {
    System.out.println("The average function in integer format.");
    int sum = array[0];
    for (int i = 1; i < array.length; i++) {
      sum += array[i];
    }
    
    return sum/array.length;
  }
  
  public static double average(double[] array) {
    System.out.println("The average function in double format.");
    double sum = array[0];
    for (int i = 1; i < array.length; i++) {
      sum += array[i];
    }
    
    return sum/array.length;
  }
 
  
}
