/*
 * ����switch���
 */
public class TestSwitch {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			double d = Math.random();
			System.out.println(d);			
			int a = (int)(d * 6) + 1;
			System.out.println(a);			
			switch (a) {
			case 6:
				System.out.println("�����ǳ���");
				break;
			case 5:
				System.out.println("�����ܲ���");
				break;
			case 4:
				System.out.println("�������а�");
				break;
			case 3:
				System.out.println("�����ܴպ�");
				break;
			case 2:
				System.out.println("������զ��");
				break;
			case 1:
				System.out.println("�����ǳ���");
				break;
			default:
				System.out.println(a);
				break;
			}
		}
		}
}
