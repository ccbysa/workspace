package liang04;

public class Test4_15 {
	public static void main(String[] args) {
		int balance = 1000;
		System.out.println(balance%9);
		while (true) {
			if (balance < 9) {
				break;
			}
			balance -= 9;
		}
		
		System.out.println(balance);
	}
}
