/*
 * ����switch ����б��ʽ���ַ�
 * ������case ��͸����
 */
public class TestSwitchChar {
	public static void main(String[] args) {
		char a = 'a';
		for (int i = 0; i < 10; i++) {
			int j= (int)(Math.random()*26);
			//char b = (char)(a+j);
			System.out.println((char)(a+j));
			
			switch ((char)(a+j)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Ԫ��");
				break;
			case 'w':
			case 'y':
				System.out.println("��Ԫ��");
				break;
			default:
				System.out.println("����");
				break;
			}
			//a = (char)(a+1);
		}
	}
}
