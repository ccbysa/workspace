/*
 * ≤‚ ‘∑Ω∑®
 */
public class TestMethod {
	public static void main(String[] args) {
		test01(100, 4, 5);
		int b = test02(5);
		System.out.println(b);
	}
	public static void test01(int a, int b, int c)
	{
		for (int i = 1; i <= a; i++) {
			if (i%b == 0) {
				System.out.print(i + "\t");
			}
			if (i%(b*c) == 0) {
				System.out.println();
			}
		}
	}
	public static int test02(int a)
	{
		if (a < 2) {
			return 1;
		}
		return a*test02(a-1);
	}
}
