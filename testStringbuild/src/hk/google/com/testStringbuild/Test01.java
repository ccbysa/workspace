package hk.google.com.testStringbuild;
/**
 * 测试可变字符序列，
 * StringBuilder(线程不安全，效率高)，一般局部变量用它
 * StringBuffer（线程安全，效率低）,一般不用 。需要线程锁
 * String ,不可变字符序列
 * @author willard
 *
 */
public class Test01 {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();//字符数组长度初始化为16
		StringBuilder sb1 = new StringBuilder(32);//字符数组长度初始化为32
		StringBuilder sb2 = new StringBuilder("abcd");//字符数组长度初始化为4+15
		System.out.println("Test01.main()");
		System.out.println(sb.length());
		System.out.println(sb1.length());
		System.out.println(sb2.length());
		sb2.append("efg");
		System.out.println(sb2);
		System.out.println(sb2.length());
		sb2.append(true);
		System.out.println(sb2);
		System.out.println(sb2.length());
		sb2.delete(1, 3);
		System.out.println(sb2);
		sb2.insert(2, "xyz");
		System.out.println(sb2);
		sb2.deleteCharAt(2);
		System.out.println(sb2);
		sb2.append(true).append(123).append('&').append(false);
		System.out.println(sb2);//通过teturn this实现方法链
		System.out.println("*******************");
		StringBuilder sb3 = new StringBuilder("a");//创建了2个对象
		for (int i = 0; i < 10; i++) {
			sb3.append(i);
			//System.out.println(sb3);
		}
		System.out.println("out of for, sb3 = " + sb3);
		System.out.println(sb3.charAt(5));
		System.out.println("******************************");
		sb3.append(-100);
		System.out.println(sb3);
		System.out.println(sb3.replace(2, 2, "hello"));
		System.err.println(sb3.reverse());
		System.out.println(sb3);
		
		
	}
}
