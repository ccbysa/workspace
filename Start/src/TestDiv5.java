/*
 * ����1000�����ܱ�5����������ÿ�����3��
 */
public class TestDiv5 {
	public static void main(String[] args) {
		int start = 0;
		int end = 1000;
		int a = 5;
		int num = 0;
		while (start <= end) {
			if (start%a == 0) {
				System.out.print(start + "\t");
				num++;
				if (num%3!= 0) {
					System.out.print("\t");
				}
				else {
					System.out.print('\n');
				}
			}
			
			start++;
		}
	}
}
