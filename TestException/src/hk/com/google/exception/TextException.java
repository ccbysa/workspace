package hk.com.google.exception;
/**�����쳣
 * 
 * @author willard
 *
 */
public class TextException {
	public static void main(String[] args){
		int i = 1/0;
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
