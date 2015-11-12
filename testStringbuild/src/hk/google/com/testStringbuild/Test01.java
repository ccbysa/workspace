package hk.google.com.testStringbuild;
/**
 * ���Կɱ��ַ����У�
 * StringBuilder(�̲߳���ȫ��Ч�ʸ�)��һ��ֲ���������
 * StringBuffer���̰߳�ȫ��Ч�ʵͣ�,һ�㲻�� ����Ҫ�߳���
 * String ,���ɱ��ַ�����
 * @author willard
 *
 */
public class Test01 {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();//�ַ����鳤�ȳ�ʼ��Ϊ16
		StringBuilder sb1 = new StringBuilder(32);//�ַ����鳤�ȳ�ʼ��Ϊ32
		StringBuilder sb2 = new StringBuilder("abcd");//�ַ����鳤�ȳ�ʼ��Ϊ4+15
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
		System.out.println(sb2);//ͨ��teturn thisʵ�ַ�����
		System.out.println("*******************");
		StringBuilder sb3 = new StringBuilder("a");//������2������
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
