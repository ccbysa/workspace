/*
 * 测试switch语句
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
				System.out.println("手气非常好");
				break;
			case 5:
				System.out.println("手气很不错");
				break;
			case 4:
				System.out.println("手气还行吧");
				break;
			case 3:
				System.out.println("手气很凑合");
				break;
			case 2:
				System.out.println("手气不咋地");
				break;
			case 1:
				System.out.println("手气非常差");
				break;
			default:
				System.out.println(a);
				break;
			}
		}
		}
}
