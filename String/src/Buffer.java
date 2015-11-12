
public class Buffer {
	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		int times = 10000;
		long startTime = System.currentTimeMillis();
		StringBuffer a = new StringBuffer();
		
		for (int i = 0; i < times; i++) {
			a.append(str);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
	}
}
