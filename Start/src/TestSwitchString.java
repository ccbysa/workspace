/*
 * ����JDK�е������ԣ���string ��֧��
 */
public class TestSwitchString {
	public static void main(String[] args) {
		String a = "hell";
		switch (a) {
		case "hello":
			System.out.println(a);
			break;
		case "world":
			System.out.println("world");
			break;

		default:
			System.out.println("���������:"+ a);
			break;
		}
	}
}
