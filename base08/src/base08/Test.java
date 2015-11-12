package base08;

class Test {
	public static void main(String[] args) {
		/*Human h1 = new Human();
		System.out.println(h1.getHeight());
		h1.growHeight(8);
		System.out.println(h1.getHeight());
		h1.breath();*/
		
		Woman w = new Woman(150);
		System.out.println(w.getHeight());
		w.growHeight(30);
		System.out.println(w.getHeight());
		w.breath();
	}
}

class Human {
	private int height;
	
	public Human(int height) {
		// TODO Auto-generated constructor stub
		this.height = height;
		System.out.println("Human: I am born, my height is " + height + "cm");
		//System.out.println("Human");
	}
	
	
	public int getHeight() {
		return this.height;
	} 
	
	public void growHeight(int a) {
		height += a;
	}
	
	public void breath() {
		System.out.println("hu...hu...hu...");
	}
}

class Woman extends Human {
	public Woman(int height) {
		super(height);
		System.out.println("Woman");
		
	}

	public void giveBirth() {
		System.out.println("hello");
	} 
	
	public void breath() {
		super.breath();
		System.out.println("su...");
	} 
}
