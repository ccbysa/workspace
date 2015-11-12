package advanced05;

public class Demo {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new NewThread2(), "first thread");
		Thread thread2 = new Thread(new NewThread2(), "second thread");
		
		thread1.start();
		thread2.start();
	}
}

class NewThread2 implements Runnable {
	public void run() {
		System.out.println(this);
	}
	
	public String toString() {
		return Thread.currentThread().getName();
	}
}
