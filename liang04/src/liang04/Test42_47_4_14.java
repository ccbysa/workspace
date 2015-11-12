package liang04;

public class Test42_47_4_14 {
	public static void main(String[] args) {
		int count = 0;
		for (char i = 0; ; i++) {
			if (i > '~') {
				break;
			}
			if (i >= '!') {
				System.out.print(i);
				System.out.print('\t');
				count++;
				if (count%5 == 0) {
					System.out.println();
				}
			}
			
		}
	}
}
