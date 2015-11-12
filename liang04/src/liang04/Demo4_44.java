package liang04;

public class Demo4_44 {
	public static void main(String[] args) {
		final int COUNT = 1000000;
		int sum = 0;
		
		for (int i = 0; i < COUNT; i++) {
			double positionX = (Math.random()-0.5)*2;
			double positionY = (Math.random()-0.5)*2;
			if (positionX < 0) {
				sum++;
			}
			else if (positionX*positionY>0 && (positionX < positionY)) {
				sum++;
			}
		}
		
		System.out.println("probability is: "+(1.0*sum/COUNT));
	}
}
