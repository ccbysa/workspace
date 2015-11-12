/*
 * 测试100以内的奇数和
 */
public class TestSumOdd {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 100; i+=2) {
			sum += i;
		}
		System.out.println("sum = " + sum);
		int sum1 = 0;
		for (int i = 2; i <= 100; i+=2) {
			sum1 += i;
		}
		System.out.println("sum1 = " + sum1+"\n********************");
		
		int start = 1;
		int end = 10;
		int sum2 = 0;
		for (int i = start; i <= end; i++) {
			sum2 += jiecheng(i);
			System.out.println(i + " i: "+jiecheng(i));
			System.out.println("sum2 :"+sum2+"\n_________");
		}
		System.out.println("sum2 = " + sum2);
		
		
	}
	public static int jiecheng(int a)
	{
		int b = 1;
		if (a == 1) {
			return 1;
		} 
		return a*jiecheng(a-1);
	}
}
