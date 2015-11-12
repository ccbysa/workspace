package hk.com.google.teststring;
/**
 * 测试String类
 * @author willard
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str1 = new String("abcd");
		String str2 = new String("abcd");
		System.out.println(str1.charAt(2));
		System.out.println(str1.equals(str1));
		System.out.println(str1.equals(str2));//内容是否相等
		System.out.println(str1 == str2);//引用是否相等
		
		String str3 = "abcd";
		String str4 = "abcd";
		System.out.println(str3.charAt(3));
		System.out.println(str3.equals(str4));
		System.out.println(str3 == str4);
		System.out.println(str3.indexOf("x"));
		System.out.println(str3.indexOf("b"));
		
		String s = str3.substring(0);
		System.out.println(s);
		String str5 = "aaaa".replace("aa", "x");
		System.out.println(str5);
		
		String str6 [] = "www.google.com.cn.hk".split(".");
		String str7 [] = "aaa:bbb:ddgd:asewgr:gaertf:grger:gdrg".split(":");
		for (int i = 0; i < str6.length; i++) {
			System.out.println("string 6");
			System.out.println(str6[i]);
		}
		for (int i = 0; i < str7.length; i++) {
			System.out.println("string 7");
			System.out.println(str7[i]);
		}
		System.out.println("abcdefghijklmn");
		System.out.println("   dg dgg  ".trim());
		
		String str8 = "hello,wolrld";
		char str9[] = str8.toCharArray();
		for (int i = 0; i < str9.length; i++) {
			System.out.println(str9[i]);
		}
		
		System.out.println("******************************");
		System.out.println("abc".equalsIgnoreCase("Abc"));
		System.out.println("abc".equals("Abc"));
		
		System.out.println("abcdbe".indexOf("b"));
		System.out.println("abcdbe".lastIndexOf("b"));
		System.out.println("abcd".startsWith("a"));
		System.out.println("abcd".startsWith("x"));
		System.out.println("abcd".endsWith("d"));
		System.out.println("abcd".endsWith("a"));
		System.out.println("aBcEDd".toLowerCase());
		System.out.println("aBcEdd".toUpperCase());
		
		System.out.println("******************************");
		String str10 = new String("a");//创建了2个对象
		String str11 = "a";//创建了1个对象
		for (int i = 0; i < 3; i++) {//创建了3个对象，这样写很浪费空间
			str10 = str10 + i;
			System.out.print("str10:");
			System.out.println(str10);
			
		}
		for (int i = 0; i < 3; i++) {//创建了3个对象，这样写很浪费空间
			str11 = str11 + i;
			System.out.print("str11:");
			System.out.println(str11);
			
		}
	}
}
