/*
 * ≤‚ ‘if”Ôæ‰
 */
public class SingleIf {
	public static void main(String[] args) {
		double a = Math.random();
		int b = 1+ (int)(a * 6);
		if (b < 3) {
			System.out.println(a);
			System.out.println("b < 3");
		}
		else {
			System.out.println(a);
			System.out.println("b > 3");
		}
	}
}
