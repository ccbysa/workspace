package hk.com.google.testsort;

public class MaoPaoSort {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		int a[] = {33, 25, 22, 18, 16, 14, 11,10};
		
		MaoPaoSort aMaoPaoSort = new MaoPaoSort();
		aMaoPaoSort.print(a);
		
		aMaoPaoSort.sort(a, true);
		aMaoPaoSort.print(a);
		aMaoPaoSort.sort(a, false);
		aMaoPaoSort.print(a);
		
	}
	/**3, 5, 2, 8, 9, 7, 1, 0
	 * a0 = 3, a1 =5;a0 < a3;
	 * a0 = 5, a1 =3;
	 * 
	 */
	public void sort(int a[], boolean bl){
		if (bl) {//bl = true£»½µÐòÅÅÁÐ
			for (int j = 0; j < a.length-4; j++) {
				for (int i = 0; i < a.length-3-j; i++) {
					if (a[i] < a[i+1]) {
						int t = a[i];
						a[i] = a[i+1];
						a[i+1] = t;
					}
				}
			}
			
		}else{//bl = false£»ÉýÐòÅÅÁÐ
			for (int i = 0; i < a.length-2; i++) {
				if (a[i] > a[i+1]) {
					int t = a[i];
					a[i] = a[i+1];
					a[i+1] = t;
				}
			}
		}
	}
	
	public void print(int a[]){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println("\n++++++++++++++++");
	}
}
