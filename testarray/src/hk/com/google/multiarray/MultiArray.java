package hk.com.google.multiarray;
/**
 * ²âÊÔ¶àÎ¬Êı×é
 * @author willard
 *
 */
public class MultiArray {
	public static int[][] add(int a[][], int b[][]){
		int c[][]= new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				//System.out.println(c[i][j] + "\t");
			}
		}
		return c;
	}
	public static void print(int a[][], int b[][], int c[][]){
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(a[i][j] + "\t" );
			}
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(b[i][j] + "\t");
			}
			for (int j = 0; j < c[i].length; j++) {
				System.out.print( c[i][j]+ "\t");
			}
			System.out.println("\n");
			
			if (i == 0) {
				for (int j = 0; j < c[i].length-1; j++) {
					System.out.print("\t");
				}
				System.out.println("    +\t\t\t    =\n");
			}
			
		}
	}
	public static void main(String[] args) {
		int a[][] = {{1, 2, 3}, {4, 5, 6}};
		int b[][] = {{12, 12, 23}, {41, 54, 16}};
		int [][]c = new int[2][3];
		
		c = add(a, b);
		print(a, b, c);
		
		}
		
	}
	
