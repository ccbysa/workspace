package advanced02;

public class Test {
	public static void main(String[] args) {
		Battery aBattery = new Battery();
		aBattery.chargeBattery(0.5);
		aBattery.useBattery(-0.5);
	}
}

class Battery {
	private double p = 0.0;
	
	public void chargeBattery(double a) {
		p += a;
		if (p > 1.0) {
			p = 1.0;
		}
	}
	
	public boolean useBattery(double a) {
		try {
			test(a);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch exception.");
			System.out.println(e.getMessage());
			p = 0.0;
		}
		
		p -= a;
		if (p < 0) {
			p = 0.0;
			return false;
		}
		return true;
	}
	
	public void test(double a) throws Exception {
		if (a < 0) {
			Exception e = new Exception("P must be positive.");
			throw e;
		}
	}
}
