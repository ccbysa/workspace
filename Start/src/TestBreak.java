/*
 * ²âÊÔbreakÓï¾ä
 */
public class TestBreak {
	public static void main(String[] args) {
		int num = 0;
		while (true) {
			int i = (int)(Math.random()*100);
			if (i == 88) {
				break;
			}
			num++;
		}
		System.out.println("num = "+ num);
	}
}
