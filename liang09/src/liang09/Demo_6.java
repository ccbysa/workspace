package liang09;

public class Demo_6 {
  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder("hello, world.");
    stringBuilder.append("I am appending.");
    System.out.println(stringBuilder);
    stringBuilder.delete(2, 4);
    System.out.println(stringBuilder);
    stringBuilder.deleteCharAt(3);
    System.out.println(stringBuilder);
    String s = "xyzjk";
    stringBuilder.insert(4, true);
    System.out.println(stringBuilder);
    stringBuilder.insert(3, 2);
    System.out.println(stringBuilder);
    stringBuilder.setCharAt(4, 'x');
    System.out.println(stringBuilder);
    System.out.println(stringBuilder.reverse());
    System.out.println(stringBuilder);
    stringBuilder.replace(3, 5, s);
    stringBuilder.reverse();
    System.out.println(stringBuilder);
    s = stringBuilder.toString();
    System.out.println(s);
    System.out.println(stringBuilder.capacity());
    System.out.println(stringBuilder.length());
    stringBuilder.setLength(50);
    System.out.println(stringBuilder.capacity());
    System.out.println(stringBuilder.length());
    stringBuilder.setLength(16);
    System.out.println(stringBuilder);
    System.out.println(stringBuilder.capacity());
    System.out.println(stringBuilder.length());
    System.out.println(stringBuilder.charAt(1));
  }
}
