package hk.com.google.testEncapsulation01;

import hk.com.google.testEncapsulation02.TestSecond;

/**
 * 测试封装
 * 这个是第一个包，还有第二个package hk.com.google.testEncapsulation01
 * @author willard
 * @version 1.0
 */
public class TestFirst {
	public static void main(String[] args) {
		System.out.println("TestFirst.main()");
		System.out.println("测试封装的权限");
		TestSecond t = new TestSecond();
		/*t.a = 5;
		t.b = 5;
		t.c = 5;//不要的包中 是不可见的*/
		t.d = 5;//所有类中都可见
		
	}
}
