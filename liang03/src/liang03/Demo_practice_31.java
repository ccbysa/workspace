package liang03;

import java.util.Scanner;

public class Demo_practice_31 {
	public static void main(String[] args) {
		System.out.println("请输入多项式的系数：");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double delta = b*b-4*a*c;
		if (delta > 0) {
			System.out.println("有2组解");
			double r1 = (-1*b+Math.pow(delta, 0.5))/2/a;
			double r2 = (-1*b-Math.pow(delta, 0.5))/2/a;
			System.out.println("第一组解： " + r1);
			System.out.println("第二组解： " + r2);
		}
		else if (delta == 0) {
			System.out.println("有1组解");
			double r1 = -1.0*b/2/a;
			System.out.println("解： " + r1);
			
		}
		else {
			System.out.println("无解");
		}
		
		input.close();
	}
}
