package advanced07;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Test {
	public static void main(String[] args) {
		Human me = new Human("Lilei");
		me.drinkWater(0.3);
	}
}

class Human {
	
	private class  Cup {
		private double water = 1.0;
		
		public void  useCup(double w) {
			this.water -= w;
		}
		
		public double getWater() {
			return this.water;
		}
	}
	
	public Human(String n) {
		// TODO Auto-generated constructor stub
		this.myCup = new Cup();
		this.name = n;
		
	}
	
	private Cup myCup = new Cup();
	private String name;
	
	public void drinkWater(double w) {
		myCup.useCup(w);
		System.out.println(myCup.getWater());
	}
}
