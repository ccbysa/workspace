public class Demo {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" * "+i+" = "+i*j+'\t');
			}
			System.out.println();
		}
		System.out.println("*************************");
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i<=j) {
					System.out.printf("%d * %d = %d\t", i, j, i*j);
				}
				if (i>j) {
					System.out.print("          \t");
				}
			}
			System.out.println();
			
		}
		
	}
}
