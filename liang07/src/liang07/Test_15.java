package liang07;

public class Test_15 {
  public static void main(String[] args) {
    double[][] set1 = {{1, 1}, {2, 2}, {3, 3}, {4, 4}};
    double[][] set2 = {{0, 1}, {1, 2}, {4, 5}, {5, 6}};
    double[][] set3 = {{0, 1}, {1, 2}, {4, 5}, {4.5, 4}};
    
    testLine(set1);
    testLine(set2);
    testLine(set3);
  }
  
  public static void testLine(double[][] set) {
    double k = 0;
    double b = 0;
    if (set[1][0] == set[0][0]) {
      k = 0;
      b = set[0][0];
    }
    else {
      k = (set[1][1]-set[0][1])/(set[1][0]-set[0][0]);
      b = set[1][1]-k*set[1][0];
    }
    int i = 2;
    for (; i < set.length; i++) {
      if (set[i][1] != (k*set[i][0]+b)) {
        System.out.println("i = "+i+" is not on the same line.");
        break;
      }
    }
    if (i == set.length) {
      System.out.println("all the point are on the same line.");
    }
  }
  
}
