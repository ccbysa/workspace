package liang04;

public class Demo4_9 {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES = 50;
		int count = 0;
		
		for (int i = 2; ;i++) {
			int divitor = 0;
			if (count == NUMBER_OF_PRIMES) {
				break;
			}
			for (int j = 2; j <= i; j++) {
				if (i%j == 0) {
					divitor++;
				}
				if (divitor == 2 && i!=j) {
					break;
				}
			}
			if (divitor == 1) {
				System.out.print(i+"\t");
				count++;
				if (count%5 == 0) {
					System.out.println();
				}
			}
		}
	}
}
