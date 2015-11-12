package base06;

public class Test {
	public static void main(String[] args) {
		Troch t = new Troch();
		t.getCharge();
		t.turnOn(2);
		t.getCharge();
		t.charge(5);
		t.getCharge();
		t.turnOn(2);
		t.getCharge();
		t.turnOn(2);
		t.getCharge();
		t.turnOn(1);
		t.getCharge();
	}
}

class Battery {
	public void chargeBattery(double p) {
		if (this.power < 1.) {
			this.power += p;
		}
	}
	
	public boolean useBattery(double p) {
		if (this.power >= p) {
			this.power -= p;
			return true;
		}
		else {
			System.out.println("the power is not enough.");
			this.power = 0;
			return false;
		}
	}
	public double getPower() {
		return power;
	}
	private double power = 0.0;
}

class Troch {
	private Battery b = new Battery();
	
	public void turnOn(int hours) {
		boolean usable;
		usable = b.useBattery(hours*0.1);
		
		if (usable == false) {
			System.out.println("The power is not more. Please charge it");
		}
	}
	
	public void charge(int hours) {
		b.chargeBattery(hours*0.2);
	}
	
	public void getCharge() {
		System.out.println("the power is: "+b.getPower());
	}
}