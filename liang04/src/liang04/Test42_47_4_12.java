package liang04;

public class Test42_47_4_12 {
	public static void main(String[] args) {
		int testNumber = 12000;
		int i = 0;
		
		for (i = 0; i*i < testNumber; i++) { }
		System.out.println(i);
		System.out.println(Math.pow(i-1, 2));
		System.out.println(Math.pow(i, 2));
		
	}
}
