package hk.com.google.testEncapsulation01;

import hk.com.google.testEncapsulation02.TestSecond;

/**
 * ���Է�װ
 * ����ǵ�һ���������еڶ���package hk.com.google.testEncapsulation01
 * @author willard
 * @version 1.0
 */
public class TestFirst {
	public static void main(String[] args) {
		System.out.println("TestFirst.main()");
		System.out.println("���Է�װ��Ȩ��");
		TestSecond t = new TestSecond();
		/*t.a = 5;
		t.b = 5;
		t.c = 5;//��Ҫ�İ��� �ǲ��ɼ���*/
		t.d = 5;//�������ж��ɼ�
		
	}
}
