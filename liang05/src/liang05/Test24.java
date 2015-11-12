package liang05;

public class Test24 {
  private static long remaindMilliSecond;
  public static void main(String[] args) {
    long timeNow = System.currentTimeMillis();
    int year = getYear(timeNow);
    System.out.println("Year: "+year);
    int month = getMonth(remaindMilliSecond, year);
    System.out.println("Month: "+month);
    int date = getDate(remaindMilliSecond);
    System.out.println("Date: "+date);
    int hour = getHour(timeNow);
    System.out.println("hour: "+hour);
    int minute = getMinute(remaindMilliSecond);
    System.out.println("minute: "+minute);
    int second = getSecond(remaindMilliSecond);
    System.out.println("second: "+second);
  }
  
  public static boolean isLeapYear(int year) {
    if ((year%4==0 && year%100 != 0)||(year%400 == 0)) {
      return true;
    }
    return false;
  }
  
  public static long secondOfYear(int year) {
    if (isLeapYear(year)) {
      return 366*24*3600;
    }
    
    return 365*24*3600;
  }

  public static int getYear(long time) {
    int i = 1970;
    remaindMilliSecond = time;
    
    for (; ; i++) {
      if (time-secondOfYear(i)*1000<0) {
        break;
      }
      time -= secondOfYear(i)*1000;
      remaindMilliSecond = time;
    }
    
    return i;
  }
  
  public static int getMonth(long time, int year) {
    int i = 1970;
    remaindMilliSecond = time;
    
    for (i = 1; i <= 12 ; i++) {
      if (time-secondOfmonth(year, i)*1000 < 0) {
        break;
      }
      time -= secondOfmonth(year, i)*1000;
      remaindMilliSecond = time;
    }
    
    return i;
  }
  
  public static long secondOfmonth(int year, int m) {
    switch (m) {
      case 1: return 31*24*3600;
      case 3: return 31*24*3600;
      case 5: return 31*24*3600;
      case 7: return 31*24*3600;
      case 8: return 31*24*3600;
      case 10: return 31*24*3600;
      case 12: return 31*24*3600;
      
      case 2:
        if (isLeapYear(year)) {
          return 29*24*3600;
        }
        return 28*24*3600;
 
      default:
        return 30*24*3600;
        
    }
  }
  
  public static int getDate(long time) {
    int date = 1;
    for (date = 1; ; date++) {
      if ((remaindMilliSecond-24*3600*1000)<0) {
        break;
      }
      remaindMilliSecond -= 24*3600*1000;
    }
    return date;
  }

  public static int getHour(long time) {
    return (int)(time/1000%(24*3600)/3600);
  }
  
  public static int getMinute(long time) {
    return (int)(time/1000%3600/60);
  }
  
  public static int getSecond(long time) {
    return (int)(time/1000%60);
  }
  
}
