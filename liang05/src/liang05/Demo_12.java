package liang05;

import java.util.Scanner;

public class Demo_12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please input year: ");
    int year = getInput(input);
    System.out.print("Please input month: ");
    int month = getInput(input);
    int week = calcWeek(year, month);
    int days = getDayOfMonth(year, month);
    printTitleLine(year, month);
    printDate(days, week);
    
    input.close();
    
  }
  
  public static int getInput(Scanner input) {
    int number = input.nextInt();
    
    return number;
  }
  
  public static int calcWeek(int year, int m) {
    int h = 0;
    
    if (m < 3) {
      m += 12;
      year--;
    }
    
    int j = year/100;
    int k = year%100;
    h = (1+26*(m+1)/10+k+k/4+j/4+5*j)%7;
    h -= 1;
    if (h == -1) {
      h = 6;
    }
    
    return h;
  }

  public static int  getDayOfMonth(int year, int month) {
    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        return 31;
      case 2:
        if (isLeepYear(year)) {
          return 29;
        }
        return 28;

      default:
        return 30;
       
    }
  }

  public static boolean isLeepYear(int year) {
    if ((year%4==0 && year%100 != 0) || (year%400 == 0)) {
      return true;
    }
    
    return false;
  }

  public static void printTitleLine(int year, int month) {
    System.out.println("                       "+digitToStr(month)+",  "+year);
    System.out.println("---------------------------"+
        "-------------------------------");
    System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
  }
  
  public static void printDate(int days, int week) {
    int count = 0;
    for (int i = 1; i <= days; i++) {
      //第一个数字前，可能有空格
      if (i==1) {
        System.out.print('\t');
        for (int j = 0; j < week; j++) {
          System.out.print("\t");
          count++;
        }        
      }
      System.out.print(i);
      count++;
      if (count%7==0) {
        System.out.print("\n\t");
      }
      else {
        System.out.print('\t');
      }
    }
  }
  
  public static String digitToStr(int m) {
    switch (m) {
      case 1:
        return "January";
        
      case 2:
        return "February";
        
      case 3:
        return "March";
        
      case 4:
        return "April";
        
      case 5:
        return "May";
        
      case 6:
        return "June";
        
      case 7:
        return "July";
        
      case 8:
        return "August";
        
      case 9:
        return "September";
        
      case 10:
        return "October";
        
      case 11:
        return "Noveber";
        
      case 12:
        return "December";
        
      default:
        return "";
    }
  }
  
}
