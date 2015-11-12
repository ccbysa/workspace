/*
 * 测试switch 语句中表达式是字符
 * 利用了case 穿透现象
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
				System.out.println("元音");
				break;
			case 'w':
			case 'y':
				System.out.println("半元音");
				break;
			default:
				System.out.println("辅音");
				break;
			}
			//a = (char)(a+1);
		}
	}
}
