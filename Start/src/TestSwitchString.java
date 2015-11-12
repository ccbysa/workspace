/*
 * 测试JDK中的新特性，对string 的支持
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
			System.out.println("您输入的是:"+ a);
			break;
		}
	}
}
