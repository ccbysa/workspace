package liang06;

public class Test_20_2 {
  public static void main(String[] args) {
    int[] queens = new int[64];
    java.util.Arrays.fill(queens, -1);
    //printQueens(queens);
    
    
    for (int i = 0; i < queens.length; i++) {
      int count = 0;
      if (queens[i] == 0 || queens[i] == 1) {
        continue;
      }
      //if a[i] = 1, check if all the related place is not conflict
      if (checkBeforeFill(queens, i)) {
        fillQueens(queens, i);  //fill with 0 or 1.
        count++;
        if (count == 7) {   //fill finished.
          break;
        }
      }
      else {
        queens[i] = 0;
      }
    }
    
    printQueens(queens);
    
  }
  
  public static boolean checkBeforeFill(int[] a, int index) {
    if (a[index] != -1) {
      return false;
    }
    
    int i = index/8;
    int j = index%8;
    if (checkCross(a, i, j) && checkLine(a, i, j)) {
      return true;
    }
    
    return false;
  }
  
  public static boolean checkCross(int[] a, int i, int j) {
    for (int j2 = 0; j2 < i; j2++) {
      if (j-1-j2 >= 0) {
        if (a[(i-j2-1)*8+(j-1-j2)] == 1) {
          return false;
        }
      }
      
      if (j+1+j2 < a.length/8) {
        if (a[(i-j2-1)*8+(j+1+j2)] == 1) {
          return false;
        }
      }
    }
    
    for (int j2 = i+1; j2 < a.length/8; j2++) {
      if (j-(j2-i)>=0) {
        if (a[j2*8+j-(j2-i)] == 1) {
          return false;
        }
      }
      if (j+(j2-i) < a.length/8) {
        if (a[j2*8+j+(j2-i)] == 1) {
          return false;
        }
      }      
    }
    
    return true;
  }
  
  public static boolean checkLine(int[] a, int i, int j) {
    for (int j2 = 0; j2 < a.length/8; j2++) {
      if (j != j2 && a[i*8+j2] == 1) {
        return false;
      }
      if (i != j2 && a[j2*8+j] == 1) {
        return false;
      }
    }
    
    return true;
  }  
  
  public static void fillQueens(int[] a, int index) {
    a[index] = 1;
    int i = index/8;
    int j = index%8;
    fillCross(a, i, j);
    fillLine(a, i, j);
  }
  
  public static void fillLine(int[] a, int i, int j) {
    for (int j2 = 0; j2 < a.length/8; j2++) {
      if (j != j2) {
        a[i*8+j2] = 0;
      }
      if (i != j2) {
        a[j2*8+j] = 0;
      }
    }   
  }
  
  public static void fillCross(int[] a, int i, int j) {
    for (int j2 = 0; j2 < i; j2++) {
      if (j-1-j2 >= 0) {
        a[(i-j2-1)*8+(j-1-j2)] = 0;
        
      }
      
      if (j+1+j2 < a.length/8) {
        a[(i-j2-1)*8+(j+1+j2)] = 0;
      }
    }
    
    for (int j2 = i+1; j2 < a.length/8; j2++) {
      if (j-(j2-i)>=0) {
        a[j2*8+j-(j2-i)] = 0;
      }
      if (j+(j2-i) < a.length/8) {
        a[j2*8+j+(j2-i)] = 0;
      }      
    }
  }
  
  public static void printQueens(int[] a) {
    System.out.println("+-------------------------------+");
    for (int i = 0; i < a.length; i++) {
      if (a[i] == 1) {
        System.out.printf("|%2d ", a[i]);
      }
      else {
        System.out.print("|   ");
      }
      if (i%8 == 7) {
        
        System.out.println("|");
        System.out.println("+-------------------------------+");
      }
    }
  }
  
}
