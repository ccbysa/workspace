package liang07;

import java.util.Scanner;

public class Test_9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[][] chessBoard = {
        {0, 0, 0},
        {0, 0, 0},
        {0, 0, 0}}; 
    printChess(chessBoard);
    
    int count = 0;
    do {     
      System.out.print("请输入坐标值：");
      int row = input.nextInt();
      int column = input.nextInt();
      if (count%2 == 0) {//先显示'X'，再显示'O'
        chessBoard[row][column] = -1;
      }
      else {
        chessBoard[row][column] = 1;
      }
      count++;
      printChess(chessBoard);
      if (isWin(chessBoard)) {
        if (whoWin(chessBoard)==1) {
          System.out.print("\'O\'");
        }
        else {
          System.out.print("\'X\'");
        }
        System.out.println(" is win.");
        System.exit(0);
      }
      
    } while (notFinished(chessBoard));
    System.out.println("draw.");
    
    input.close();
  }
  
  public static void printChess(int[][] a) {
    System.out.println("+---+---+---+");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] == -1) {
          System.out.print("| X ");
        }
        else if (a[i][j] == 1) {
          System.out.print("| O ");
        }
        else {
          System.out.print("|   ");
        }
      }
      System.out.println("|\n+---+---+---+");
    }
  }

  public static boolean notFinished(int[][] s) {
    for (int i = 0; i < s.length; i++) {
      for (int j = 0; j < s[i].length; j++) {
        if (s[i][j] == 0) {
          return true;
        }
      }
    }
    return false;
  }

  public static boolean isWin(int[][] s) {
    boolean result = true;
    for (int i = 0; i < s.length; i++) {
      for (int j = 0; j < s[i].length-1; j++) {
        result = true;
        if (s[i][j] != 0) {
          result = result && (s[i][j]==s[i][j+1]);
          if (!result) {
            break;
          }
        }        
      }
      if (s[i][0] != 0 && result) {
        return result;
      }
    }
    
    for (int i = 0; i < s[0].length; i++) {
      result = true;
      for (int j = 0; j < s.length-1; j++) {
        if (s[j][i] != 0) {
          result = result && (s[j][i]==s[j+1][i]);
          if (!result) {
            break;
          }
        }
        
      }
      if (s[0][i] != 0 && result) {
        return result;
      }
    }
    
    if ((s[0][0] != 0) && (s[0][0]==s[1][1]) && (s[0][0]==s[2][2])) {
      return true;
    }
    
    if ((s[0][2] != 0) && (s[0][2]==s[1][1]) && (s[1][1]==s[2][0])) {
      return true;
    }
    
    return false;
  }

  public static int whoWin(int[][] s) {
    if ((s[0][0]==s[1][1]) && (s[0][0]==s[2][2])) {
      return s[0][0];
    }
    
    if ((s[0][2]==s[1][1]) && (s[1][1]==s[2][0])) {
      return s[0][2];
    }
    
    for (int i = 0; i < s.length; i++) {
      boolean result = true;
      for (int j = 0; j < s[i].length-1; j++) {
        result = result && (s[i][j]==s[i][j+1]);
      }
      if (result) {
        return s[i][0];
      }
    }
    
    for (int i = 0; i < s[0].length; i++) {
      boolean result = true;
      for (int j = 0; j < s.length-1; j++) {
        result = result && (s[j][i]==s[j+1][i]);
      }
      if (result) {
        return s[0][i];
      }
    }
    
    return 1;
  }
}
