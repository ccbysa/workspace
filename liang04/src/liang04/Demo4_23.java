package liang04;

public class Demo4_23 {
	public static void main(String[] args) {
		int startYear = 2001;
		int endYear = 2100;
		int count = 0;
		
		for (int i = startYear; i <= endYear; i++) {
			if ((i%4==0 && i%100!=0)||(i%400==0)) {
				System.out.print(i+"\t");
				count++;
				if (count%10==0) {
					System.out.println();
				}
			}
		}
	}
}
