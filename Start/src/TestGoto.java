/*���Դ���ǩ��continue
 * 
 */
public class TestGoto {
	public static void main(String[] args) {
		outer:for (int i = 2; i <=150; i++) {
			for (int j = 2; j <= i/2; j++) { //���дj< i/2������4������������Ϊ�������ѭ������
				if (i%j == 0) {
					continue outer;
				}
			}
			System.out.println("i = " + i);
		}
	}
}
