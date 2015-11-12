package base10;


public class Demo {
		public static void main(String[] args) {
			Test t = new Test();
			System.out.println(t.cupContent());
			t.addWater(50);
			System.out.println(t.cupContent());
			t.drinkWater(20);
			t.play();
			System.out.println(t.cupContent());
			
		}
}

class Test implements MetricCup {
	private int height = 0;
	
	public void addWater(int w) {
		this.height += w;
	}
	
	public void drinkWater(int w) {
		this.height -= w;
	}
	
	public int cupContent() {
		return this.height;
	}
	
	public void play() {
		System.out.println("duo rui mi fa ...");
	} 
	
	
}
