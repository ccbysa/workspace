package liang07;

public class Demo_3 {
  public static void main(String[] args) {
    double[][] points = {
        {-1, 3}, {-1, -1}, {1, 1}, {2, 0.5},
        {2, -1}, {3, 3}, {4, 2}, {4, 0.5}};
    double[][] distance = new double[8][8];
    
    for (int i = 0; i < points.length; i++) {
      for (int j = 0; j < points.length; j++) {
        distance[i][j] = calcDistance(points[i], points[j]);
      }
    }
    
    printDistance(distance);
    shortestPointer(distance, points);
    
  }
  
  public static double calcDistance(double[] point1, double[] point2) {
    double length = Math.sqrt(Math.pow(point1[0]-point2[0], 2)
        +Math.pow(point1[1]-point2[1], 2));
    return (int)(length*100)/100.0;
  }
  
  public static void printDistance(double[][] distance) {
    for (int i = 0; i < distance.length; i++) {
      for (int j = 0; j < distance[i].length; j++) {
        System.out.printf("%.2f\t", distance[i][j]);
      }
      System.out.println();
    }
  }
  
  public static double shortestPointer(double[][] d, double[][] point) {
    int row = 0;
    int column = 1;
    double shortest = d[row][column];
    
    for (int i = 0; i < d.length; i++) {
      for (int j = 0; j < d[i].length; j++) {
        if ((d[i][j] != 0) && (d[i][j] < shortest)) {
          shortest = d[i][j];
          row = i;
          column = j;
        }
      }
    }
    System.out.println("shorst: "+shortest);
    
    System.out.println("row: "+row);
    for (int i = 0; i < point[row].length; i++) {
      System.out.print(point[row][i]+"\t");
    }
    System.out.println();
    
    System.out.println("column: "+column);
    for (int i = 0; i < point[column].length; i++) {
      System.out.print(point[column][i]+"\t");
    }
    System.out.println();
    
    
    return shortest;
  }
}
