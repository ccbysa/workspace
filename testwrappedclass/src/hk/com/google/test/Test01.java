package hk.com.google.test;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("hello,world");
		Integer i = new Integer(1000);
		int b = i.byteValue();
		System.out.println(b);
		
		System.out.println(i.shortValue());
		System.out.println(i.toString(1234));
		System.out.println(i.toHexString(i));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toOctalString(i));
		System.out.println(Integer.parseInt("12310"));
		
	}
}
