package liang06;

public class Test_13 {
  public static void main(String[] args) {
    System.out.println(getRandom(new int[] {54, 3, 5, 7, 9}));
  }
  
  public static int getRandom(int...numbers) {
    int num;
    do {
      num = (int)(Math.random()*55);
    } while (isContains(numbers, num));
    return num;
  }
  
  public static boolean isContains(int[] numbers, int a) {
    for (int i = 0; i < numbers.length; i++) {
      if (a == numbers[i]) {
        return true;
      }
    }
    return false;
  }
  
}
