/*
 * ²âÊÔcontinueÓï¾ä
 */
public class TestContinue {
	public static void main(String[] args) {
		int start = 0;
		int end = 100;
		int sum = 0;
		for (int i = start; i <= end ; i++) {
			if (i%3 == 0) {
				System.out.println("i = " + i);
				continue;
			}
			System.out.println("continue,i = " + i);
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
}
