package base04;

public class Demo {
	public static void main(String[] args) {
		Human h = new Human(185);
		System.out.println(h.getHeight());
		
		Human h1 = new Human();
		System.out.println(h1.getHeight());
		h1.breath(1);
		h1.breath(3);
		
		//Human h2 = new Human();
		
	}
}

class Human {
	private int height;
	
	Human(int h) {
		// TODO Auto-generated constructor stub
		this.height = h;
		System.out.println("I am born.");
	}
	
	public Human() {
		// TODO Auto-generated constructor stub
		System.out.println("I am born, too.");
	}
	
	private void breath() {
		System.out.println("hu...hu...");
	} 
	
	public void breath(int a) {
		for (int i = 0; i < a; i++) {
			breath();
		}
	}
	
	int getHeight() {
		return this.height;
	}
}
