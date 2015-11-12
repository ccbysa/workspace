package liang04;

public class Test42_47_4_7 {
	public static void main(String[] args) {
		double baseFee = 10000;
		double newFee = baseFee;
		
		for (int i = 0; i < 10; i++) {
			newFee *= 1+0.05;
		}
		newFee = (int)(newFee*100)/100.0;
		System.out.println("Ten years later, newFee = "+newFee);
		
		double totalFee = newFee;
		for (int i = 0; i < 3; i++) {
			newFee *= 1+0.05;
			System.out.println(newFee);
			totalFee += newFee;
		}
		totalFee = (int)(totalFee*100)/100.0;
		System.out.println("Total 4 years' Fee is: "+totalFee);
		
	}
}
