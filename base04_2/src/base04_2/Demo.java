package base04_2;

public class Demo {
	public static void main(String[] args) {
		Torch t = new Torch(-500);
		t.getPower();
		t.turnon(10);
		t.getPower();
		t.charge(50000);
		t.getPower();
	}
}

class Torch {
	private int power = 0;
	
	public Torch(int a) {
		// TODO Auto-generated constructor stub
		if (a > 100) {
			System.out.println("power = "+ a +", is out of range, it will be change to 100");
			a = 100;
		}
		if (a < 0) {
			System.out.println("power = "+ a +", is out of range, it will be change to 0");
			a = 0;
		}
		
		this.power = a;
	}
	
	public void getPower() {
		System.out.println("Torch's power is " +this.power);
	} 
	
	public void charge(int a) {
		this.power += a/10;
		if (this.power >= 100) {
			System.out.println("Torch's power if full. Please pull off charger");
			this.power = 100;
		}
	}
	
	private void discharge(int a) {
		this.power -= a/5;
		if (this.power <= 0) {
			System.out.println("Torch's power is little. Please charge it");
			this.power = 0;
		}
	}
	
	public void turnon(int a) {
		System.out.println("Torch is on ...");
		discharge(a);
	}
	
	public void turnoff() {
		System.out.println("Torch is off ...");
	}
}