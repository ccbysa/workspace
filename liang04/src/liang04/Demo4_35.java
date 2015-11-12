package liang04;

public class Demo4_35 {
	public static void main(String[] args) {
		double sum = 0;
		for (int i = 624; i > 0; i--) {
			sum += 1/(Math.pow(i, 0.5)+Math.pow(i+1, 0.5));
		}
		
		System.out.println(sum);
	}
}
