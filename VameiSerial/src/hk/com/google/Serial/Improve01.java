package hk.com.google.Serial;
/**
 * vamei教程进阶版
 * 测试String类
 * @author willard
 * @version 1.0
 */
public class Improve01 {
	public static void main(String[] args) {
		String s = "  hEllO, WorLd   ";
		System.out.println(s + "Happy New Year.");
		System.out.println(s.length());
		System.out.println(s.charAt(4));
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 5));
		System.out.println(s.indexOf('l'));
		System.out.println(s.indexOf(" "));
		System.out.println(s.startsWith("h"));
		System.out.println(s.startsWith("H"));
		System.out.println(s.startsWith("hcllo", 1));
		System.out.println(s.endsWith("lx"));
		System.out.println(s.equals("hello, world"));
		System.out.println(s.compareTo("hello, v"));
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.replace("l", "xx"));
		char a[] = {1,2 ,3};
		System.out.println(s.valueOf(a, 2, 3));
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			System.out.println();
		}
		
	}
}
