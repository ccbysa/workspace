package liang04;

public class Demo4_6 {
	public static void main(String[] args) {
		System.out.println("                                      Multiplication Table\n");
		System.out.println("\t\t1\t2\t3\t4\t5\t6\t7\t8\t9\t|");
		System.out.println("-------------------------------"
							+"-----------------------------"
							+"----------------------------+"
				);
		for (int i = 0; i < 9; i++) {
			System.out.printf("\t"+(i+1)+" |\t");
			for (int j = 0; j < 9; j++) {
				System.out.printf((i+1)*(j+1)+"|\t");
			}
			System.out.println("|");
			System.out.println("-------------------------------"
					+"-----------------------------"
					+"----------------------------+"
		);
		}
		
	}
}
