package hk.com.google.array;
/**
 * ��������
 * @author willard
 *
 */
public class Test01 {
	public static void main(String[] args) {
		int a[];//�����2����������
		char b[];
		b = new char[2];
		b[0] = 'a'; b[1] = 'b';
		int c[] = {11, 22, 334, 44};//��̬��ʼ��
		
		a = new int[3];
		for (int i = 0; i < a.length; i++) {
			a[i] = i+10;//��ʼ��
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println("c[" + i + "] = " + c[i]);
		}
		System.out.println("+++++++++++++++++++++");
		Car[] cars = new Car[2];
		cars[0] = new Car("����");
		cars[1] = new Car("����");
		System.out.println(cars[1].name);
		
		System.out.println(cars.length);
		System.out.println("+++++++++++++++++++++");
		Car ccaCar[] = {
						new Car("�µ�"),
						new Car("����"),
						new Car("���ǵ�")
						};
		for (int i = 0; i < ccaCar.length; i++) {
			System.out.println(ccaCar[i].name);
		}
				
	}
}
