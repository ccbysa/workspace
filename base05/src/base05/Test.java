package base05;

public class Test {
	public static void main(String[] args) {
		musicCup mc = new musicCup(20);
		mc.waterContent();
		mc.drinkWater(10);
		mc.play(5);
		mc.waterContent();
		mc.addWater(50);
		mc.stop();
		mc.waterContent();
		mc.drinkWater(20);
		mc.waterContent();
	}
}

class musicCup implements Cup, Player {
	private int height = 0;
	
	public musicCup(int height) {
		// TODO Auto-generated constructor stub
		this.height = height;
	}
	public void addWater(int a) {
		height += a;
		if (height > 100) {
			System.out.println("cup is full.");
			height = 100;
		}
	}
	
	public void drinkWater(int a) {
		height -= a;
		if (height < 0) {
			System.out.println("cup is empty.");
			height = 0;
		}
	}
	
	public void play(int a) {
		System.out.println("play music " + a + " minute(s).");
	}
	
	public void  stop() {
		System.out.println("player is stopped.");
	}
	
	public void waterContent() { 
		System.out.println("water's height is " + height);;
	}
}