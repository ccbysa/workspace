package hk.com.google.test;
/**
 * 测试自动装箱 和自动拆箱
 */
public class Test02 {
	public static void main(String[] args) {
		Integer a = 1000;
		Integer b = new Integer(1500);
		//自动装箱
		//jdk5.0以后，编译器自动帮助我们改进代码
		//Integer a = new Integer(1000);
		int c = new Integer(2000);
		int d = new Integer(2000).intValue();
		//自动拆箱
		//jdk5.0以后，编译器自动帮助我们改进代码
		//int  c = new Integer(2000).intValue()
		c = a;
		c = a.intValue();
		/*
		a = null;
		c = a;*/
		System.out.println();
		Integer d1 = (1234);
		Integer d2 = (1234);
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
		
		System.out.println("___________________");
		Integer d3 = 123;//[-128, 127]之间的数据，仍然当作基本数据类型来处理
		Integer d4 = 123;//目的：为了提高效率
		System.out.println(d3 == d4);
		System.out.println(d3.equals(d4));
		System.out.println("************************");
		Integer d5 = 129;//[-128, 127]之间的数据，仍然当作基本数据类型来处理
		Integer d6 = 129;//目的：为了提高效率
		System.out.println(d5 == d6);
		System.out.println(d5.equals(d6));
		
	}
}
