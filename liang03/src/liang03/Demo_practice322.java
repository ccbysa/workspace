package liang03;

import java.util.Scanner;

public class Demo_practice322 {
	public static void main(String[] args) {
		final double RADIUS = 10.;
		System.out.println("请输入坐标值：");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		input.close();
		
		double distance = Math.pow(x*x+y*y, 0.5);
		System.out.println(distance);
		if (distance>RADIUS) {
			System.out.println("点不在圆内");
		}
		else if (distance==RADIUS) {
			System.out.println("点不在圆上");
		}
		else
			System.out.println("点在圆内");
	}
}
