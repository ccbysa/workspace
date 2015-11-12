package liang05;

public class Test16 {
  public static void main(String[] args) {
    for (int i = 2000; i <= 2010; i++) {
      System.out.println(""+i+"\t"+dayOfYear(i));
    }
  }
  
  public static int dayOfYear(int year) {
    if ((year%4 == 0 && year %100 != 0) || (year%400==0)) {
      return 366;
    }
    
    return 365;
  }
}
