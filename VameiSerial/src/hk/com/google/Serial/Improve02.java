package hk.com.google.Serial;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Improve02 {
	public static void main(String[] args) {
		Battary aBattary = new Battary();
		aBattary.chargeBattery(0.5);
		aBattary.useBattery(-0.5);
	}
}
class Battary{
	/**
	 * Increase battery
	 */
	public void chargeBattery(double p){
		if (this.power + p < 1.) {
			this.power = this.power + p;
		}
		else {
			this.power = 1;
		}
	}
	/**
	 * consum battery
	 */
	public boolean useBattery(double p){
		try {
			test(p);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch Exception");
			System.out.println(e.getMessage());
			p = 0.0;
		}
		
		if (this.power >= p) {
			this.power = this.power - p;
			return true;
		}
		else {
			this.power = 0.0;
			return false;
		}
	}
	/**
	 * test usage
	 */
	private void test(double p) throws Exception{
		if (p < 0) {
			Exception e = new Exception("p must be positive");
			throw e;
		}
	}
	
	private double power = 0;
}