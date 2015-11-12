package liang08;

import java.util.GregorianCalendar;

public class Test_5 {
  public static void main(String[] args) {
    GregorianCalendar g = new GregorianCalendar();
    System.out.println(g.get(GregorianCalendar.YEAR));
    System.out.println(g.get(GregorianCalendar.MONTH)+1);
    System.out.println(g.get(GregorianCalendar.DAY_OF_MONTH));
    
    g.setTimeInMillis(1234567898765L);
    System.out.println(g.get(GregorianCalendar.YEAR));
    System.out.println(g.get(GregorianCalendar.MONTH)+1);
    System.out.println(g.get(GregorianCalendar.DAY_OF_MONTH));
    
  }
}
