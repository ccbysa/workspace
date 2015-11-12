package liang06;

public class Demo_4 {
  public static void main(String[] args) {
    int[] poker = new int[52];
    for (int i = 0; i < poker.length; i++) {
      poker[i] = i;
    }
    
    for (int i = 0; i < poker.length; i++) {
      int j = (int)(Math.random()*poker.length);
      int temp = poker[i];
      poker[i] = poker[j];
      poker[j] = temp;
    }
    
    /*
    for (int i : poker) {
      System.out.print(i+" ");
    }
    System.out.println();
    */
    
    assignPoker(poker);
  }
  
  public static String varietyOfPoker(int index) {
    String color = "";
    switch (index/13) {
      case 0:
        color += "spades";
        break;
      case 1:
        color += "hearts";
        break;
      case 2:
        color += "diamonds";
        break;
      case 3:
        color += "clubs";
        break;

      default:
        break;
    }
    return color;
  }

  public static String number(int index) {
    String number = "";
    switch (index%13+1) {
      case 10:
        number = "10";
        break;
      case 11:
        number = "Jack";
        break;
      case 12:
        number = "Queen";
        break;
      case 13:
        number = "King";
        break;

      default:
        number += (char)('1'+index%13);
        break;
    }
    return number;
  }

  public static void assignPoker(int[] poker) {
    for (int i = 0; i < poker.length/4; i++) {
      System.out.printf("第 %d组：\n", i+1);
      for (int j = 0; j < 4; j++) {
        System.out.print("number: "+number(poker[i*4+j]));
        System.out.print("\tcolor: "+varietyOfPoker(poker[i*4+j]));
        System.out.println();
      }
      System.out.println();
    }
  }
  

}
