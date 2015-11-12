package liang06;

public class Test_24 {
  public static void main(String[] args) {
    int[] poker = new int[52];
    int[] choose = new int[4];
    int count = 0;
    java.util.Arrays.fill(choose, -1);
    
    for (int i = 0; i < poker.length; i++) {
      poker[i] = i;
    }
    for (int i = 0; i < poker.length; i++) {
      int index = (int)(Math.random()*52);
      int temp = poker[i];
      poker[i] = poker[index];
      poker[index] = temp;
    }
    
    for (int i = 0; i < choose.length; i++) {
      int index = (int)(Math.random()*52);
      count++;
      
      while (!isDiffColor(choose, poker[index])) {
        index = (int)(Math.random()*52);
        count++;
      }
      choose[i] = poker[index];
    }
    
    System.out.println("count: "+count);
    for (int i = 0; i < choose.length; i++) {
      System.out.println(choose[i]);
      System.out.println(getNum(choose[i]%13)+" of "+getColor(choose[i]));
    }
  }
  
  public static boolean isDiffColor(int[] choose, int index) {
    int color = index/13;
    
    for (int i = 0; i < choose.length; i++) {
      if (choose[i] != -1) {
        if (color == choose[i]/13) {
          return false;
        }
      }
    }
    return true;
  }

  public static String getColor(int index) {
    switch (index/13) {
      case 0:   return "Spades";
      case 1:   return "Hearts";
      case 2:   return "Diamonds";
      case 3:   return "Clubs";
                
      default:  return "";
    }
  }

  public static String getNum(int index) {
    String str = "";
    switch (index+1) {
      case 10:  return str+"10";
      case 11:  return str+"Jack";
      case 12:  return str+"Queen";
      case 13:  return str+"King";
      case 1:   return str+"Ace";
      
      default:  return str+(char)(index+1+'0');
    }
  }
  
}
