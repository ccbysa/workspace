package liang08;

public class Demo_1 {
  public static void main(String[] args) {
    char[] a = "java".toCharArray();
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
    
    char[] b = {'J', 'a', 'v', 'a', '1', '2', '3', '4'};
    //String c = new String(b);
    String c = String.valueOf(b);
    System.out.println(b);
    "CS3721".getChars(2, 6, b, 4);
    System.out.println(b);
    System.out.println(c);
    c = String.valueOf(12.34);
    System.out.println(c);
    float d = Float.parseFloat(c);
    System.out.printf("%f", d);
  }
}
