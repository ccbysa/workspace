package hk.com.google.test;
/**
 * �����Զ�װ�� ���Զ�����
 */
public class Test02 {
	public static void main(String[] args) {
		Integer a = 1000;
		Integer b = new Integer(1500);
		//�Զ�װ��
		//jdk5.0�Ժ󣬱������Զ��������ǸĽ�����
		//Integer a = new Integer(1000);
		int c = new Integer(2000);
		int d = new Integer(2000).intValue();
		//�Զ�����
		//jdk5.0�Ժ󣬱������Զ��������ǸĽ�����
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
		Integer d3 = 123;//[-128, 127]֮������ݣ���Ȼ����������������������
		Integer d4 = 123;//Ŀ�ģ�Ϊ�����Ч��
		System.out.println(d3 == d4);
		System.out.println(d3.equals(d4));
		System.out.println("************************");
		Integer d5 = 129;//[-128, 127]֮������ݣ���Ȼ����������������������
		Integer d6 = 129;//Ŀ�ģ�Ϊ�����Ч��
		System.out.println(d5 == d6);
		System.out.println(d5.equals(d6));
		
	}
}
