package liang04;

public class Demo4_39 {
	public static void main(String[] args) {
		double income = 5000;
		double goal = 30000;
		double total = 0;
		
		for (double i = 0.01; ; i+=0.1) {
			if (i <= 5000 ) {
				total = income+i*8/100;
			}
			if (i>5000 && i<= 10000) {
				total = income+5000*8/100+(i-5000)*10/100;
			}
			if (i>10000) {
				total = income+5000*8/100+(10000-5000)*10/100+(i-10000)*12/100;
			}
			if (total >= goal) {
				System.out.println(i);
				break;
			}
		}
	}
}
