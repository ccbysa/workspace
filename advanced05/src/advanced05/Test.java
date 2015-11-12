package advanced05;

public class Test {
	public static void main(String[] args) {
		NewThread thread1 = new NewThread();
		NewThread thread2 = new NewThread();
		thread1.start();
		thread2.start();
	}
}

class NewThread extends Thread {
	private static int threadID = 0;
	
	public NewThread() {
		// TODO Auto-generated constructor stub
		super("ID:  " + (++threadID));
	}
	
	public String toString() {
		return super.getName();
	}
	
	public void run() {
		System.out.println(this);
	}
}
