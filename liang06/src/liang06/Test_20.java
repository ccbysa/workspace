package liang06;

public class Test_20 {
  static boolean isCorrect = false;
  static int[][] temp = new int[8][8];
  
  public static void main(String[] args) {
    int[][] queens = new int[8][8];
    fillQueens(queens);

    for (int i = 0; i < queens.length; i++) {
      for (int j = 0; j < queens[i].length; j++) {
        queens[i][j] = 1;
        temp = fillQueens(queens, i, j);
        if (isCorrect) {
          System.arraycopy(temp, 0, queens, 0, queens.length);
          isCorrect = false;
        } 
      }      
      printQueens(queens);
    }
    printQueens(queens);
  }
  
  public static void fillQueens(int[][] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        a[i][j] = -1;
      }
    }
  }
  
  public static int[][] fillQueens(int[][] a, int i, int j) {
    temp = fillArrayLine(a, i, j);
    if (isCorrect) {
      temp = fillArrayCross(a, i, j);
    }
    if (isCorrect) {
      return temp;
    }
    java.util.Arrays.fill(temp,  -1);
    return temp;
    
  }
  
  public static int[][] fillArrayLine(int[][] a, int i, int j) {
    int[][] newlist = new int[8][8];
    System.arraycopy(a, 0, newlist, 0, a.length);
    for (int j2 = 0; j2 < newlist[i].length; j2++) {
      if (j2 == j) {
        continue;
      }
      if (newlist[i][j2] == 1) {
        isCorrect = false;
      }
      else if (newlist[i][j2] == -1) {
        newlist[i][j2] = 0;
      }
      else {
        isCorrect = false;
      }
    }
    
    for (int j2 = 0; j2 < newlist.length; j2++) {
      if (j2 == j) {
        continue;
      }
      if (newlist[j2][j] == 1) {
        isCorrect = false;
      }
      else if (newlist[j2][j] == -1) {
        newlist[j2][j] = 0;
      }
      else {
        isCorrect = false;
      }
    }
    
    isCorrect = true;
    return newlist;
  }

  public static int[][] fillArrayCross(int[][] a, int i, int j) {
    int[][] newlist = new int[8][8];
    System.arraycopy(a, 0, newlist, 0, a.length);
    for (int j2 = -i; j2 < newlist.length-i; j2++) {
      if (j+j2>=0 && j+j2 < newlist.length) {
        if (newlist[i+j2][j+j2]==1) {
          isCorrect = false;
        }
        newlist[i+j2][j+j2] = 0;
      }
      if (j-j2>=0 && j-j2 < a.length) {
        if (newlist[i+j2][j-j2]==1) {
          isCorrect = false;
        }
        newlist[i+j2][j-j2] = 0;
      }
    }
    isCorrect = true;
    return newlist;
  }
  
  public static void printQueens(int[][] a) {
    System.out.println("*************************************");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j]+"\t");
      }
      System.out.println();
    }
  }
  
}
