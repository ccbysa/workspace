/*测试带标签的continue
 * 
 */
public class TestGoto {
	public static void main(String[] args) {
		outer:for (int i = 2; i <=150; i++) {
			for (int j = 2; j <= i/2; j++) { //如果写j< i/2，则会把4当作质数。因为不会进入循环体了
				if (i%j == 0) {
					continue outer;
				}
			}
			System.out.println("i = " + i);
		}
	}
}
