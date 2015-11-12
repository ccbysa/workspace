package liang07;

public class Demo_2 {
  public static void main(String[] args) {
    char[][] testPaper  = {
        {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
        {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        };
    char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
    
    getScore(testPaper, key);
  }
  
  public static void getScore(char[][] test, char[] key) {
    for (int i = 0; i < test.length; i++) {
      int count = 0;
      for (int j = 0; j < test[i].length; j++) {
        if (test[i][j] == key[j]) {
          count++;
        }
      }
      System.out.printf("i = %d, count = %d.\n", i, count);
    }
  }
  
}
