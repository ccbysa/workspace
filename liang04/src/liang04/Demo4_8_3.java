package liang04;

import java.util.Random;


public class Demo4_8_3 {
	public static void main(String[] args) {
		double positionX, positionY;
		int number = 0;
		
		for (int i = 0; i < 1000000; i++) {
			positionX = Math.random()*2.0-1;
			positionY = Math.random()*2.0-1;
			
			double distance = Math.pow((Math.pow(positionX, 2)+Math.pow(positionY, 2)), 0.5);
			if (distance <= 1.0) {
				number++;
			}
		}
		
		System.out.println(number/1000000.0*4);
	}
}
