package liang07;


public class Demo_4 {
  public static void main(String[] args) {
    int[][] sudoku = {
        {5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 8, 0, 0, 7, 9},
    };
    int[] perhaps = {0, 0}; //a[0] count ; if a[0]==1, a[1] is valid.
    
    while (getZeroNumber(sudoku) != 0) {
      for (int i = 0; i < sudoku.length; i++) {
        for (int j = 0; j < sudoku[i].length; j++) {
          if (sudoku[i][j] == 0) {
            perhaps = maybeNumber(sudoku, i, j);
            if (perhaps[0] == 1) {  //只有一个数可填入
              sudoku[i][j] = perhaps[1];
            }//填入
            else {
              continue;
            }
          }
        }
      }
    }
  }
  
  public static int getZeroNumber(int[][] sudoku) {
    int number = 0;
    for (int i = 0; i < sudoku.length; i++) {
      for (int j = 0; j < sudoku[i].length; j++) {
        if (sudoku[i][j] == 0) {
          number++;
          return number;
        }
      }
    }
    
    return number;
  }
  
  public static int[] maybeNumber(int[][] sudoku, int row, int column) {
    int[] newlist = {0, 0};
    for (int i = 1; i <= 9; i++) {
      
      int j = 0;
      for (; j < sudoku.length; j++) {//column列中是否有i
        if (sudoku[j][column] == i) {
          break;
        }
      }
      /*
      if (j == sudoku.length) {//column列中没有i
        newlist[0]++;
        if (newlist[0] > 1) {
          break;
        }
        newlist[1] = i;
      }*/
      
      j = 0;
      for (; j < sudoku[row].length; j++) {//row行中是否有i
        if (j != column  && sudoku[row][j] == i) {
          break;
        }
      }
      /*
      if (j == sudoku[row].length) {//row行中没有i
        newlist[0]++;
        if (newlist[0] > 1) {//可填的数字个数大于1，找下一个
          break;
        }
        newlist[1] = i;
      }*/
      
      for (int j2 = row/3*3; j2 < (row/3+1)*3; j2++) {
        for (int k = column/3*3; k < (column/3+1)*3; k++) {
          if ((j2!=row || k!= column ) && sudoku[j2][k] == i) {
            break;
          }
        }
      }
      
      newlist[0]++;
      if (newlist[0] > 1) {//可填的数字个数大于1，找下一个
        break;
      }
      newlist[1] = i;
      
    }
    
    return newlist;
  }

  public static void printSudoku(int[][] s) {
    for (int i = 0; i < s.length; i++) {
      for (int j = 0; j < s[i].length; j++) {
        System.out.print(" "+s[i][j]+" ");
      }
      System.out.println();
    }
  }
  
  
}
