package liang04;

public class Demo4_45 {
	public static void main(String[] args) {
		final int MAX = 7;
		int sum = 0;
		
		for (int i = 1; i <= MAX; i++) {
			for (int j = 1; j <= MAX; j++) {
				if ((i-j)!= 0) {
					sum++;
					System.out.printf("%d %d, sum = %2d.\n", i, j, sum);
				}
			}
			
		}
		System.out.println("sum = "+sum);
	}
}
