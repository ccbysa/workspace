package base09;

class Human {
	private int height;
	private static int population;
	private static boolean is_mammal = true;
	
	public Human(int h) {
		// TODO Auto-generated constructor stub
		this.height = h;
		this.population = h;
	}
	public int getHeight() {
		return this.height;
	}
	public void growHeight(int h) {
		this.height += h;
	}
	public void breath() {
		System.out.println("hu...hu...hu...");
	}
	public static int getPopulation() {
		return Human.population;
	}
}


