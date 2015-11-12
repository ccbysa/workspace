package liang05;

public class Demo_11 {
  final static char LOWER_CASE_START = 'a';
  final static char LOWER_CAST_END = 'z';
  final static char UPPER_CAST_START = 'A';
  final static char UPPER_CAST_END = 'Z';
  final static char DECIMAL_START = '0';
  final static char DECIMAL_END = '9';
  final static char CHARACTER_START = '\u0000';
  final static char CHARACTER_END = '\uffff';
  final static char VISIBLE_CHAR_START = '!';
  final static char VISIBLE_CHAR_END = '~';
  
  public static void main(String[] args) {
    for (int i = 0; i < 175; i++) {
      System.out.print(getRandomLowerCase());
      if ((i+1)%10 == 0) {
        System.out.println();
      }
      /*
      else {
        System.out.print('\t');
      }
      */
    }
    System.out.println();
    
    System.out.print("Random password: ");
    for (int i = 0; i < 16; i++) {
      System.out.print(getRandomVisibleChar());
    }
    System.out.println();
    
    for (char i = '!'; i <= '~'; i++) {
      System.out.print(i);
    }
    System.out.println();
    
    System.out.print("Random user name: ");
    for (int i = 0; i <8; i++) {
      System.out.print(getRandomLowerCase());
    }
    System.out.println();
  }
  
  public static char getRandomLowerCase() {
    return getRandomCharacter(LOWER_CASE_START, LOWER_CAST_END);
  }
  
  public static char getRandomUpperCase() {
    return getRandomCharacter(UPPER_CAST_START, UPPER_CAST_END);
  }
  
  public static char getRandomDigit() {
    return getRandomCharacter(DECIMAL_START, DECIMAL_END);
  }
  
  public static char getRandomCharacter() {
    return getRandomCharacter(CHARACTER_START, CHARACTER_END);
  }
  
  public static char getRandomVisibleChar() {
    return getRandomCharacter(VISIBLE_CHAR_START, VISIBLE_CHAR_END);
  }
  
  public static char getRandomCharacter(char start, char end) {
    return (char)(start+Math.random()*(end-start+1));
  }
} 
