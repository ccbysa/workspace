
public class Demo_9 {
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.println(i+": ---"+args[i]+"---");
    }
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[2]);
    if (args[1].charAt(0) == '+') {
      System.out.println(args[0]+" + "+args[2]+" = "+(a+b));
    }
    else if (args[1].charAt(0) == '-') {
      System.out.println(args[0]+" - "+args[2]+" = "+(a-b));
    }
    else if (args[1].charAt(0) == '*') {
      System.out.println(args[0]+" * "+args[2]+" = "+(a*b));
    }
    else if (args[1].charAt(0) == '/') {
      System.out.println(args[0]+" / "+args[2]+" = "+(a/b));
    }
    
    else {
      System.out.println("else block.");
      System.out.println("nothing");
    }
  }
}