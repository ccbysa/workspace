package base11;

public class Test {
	public static void main(String[] args) {
		Human aPerson = new Human(150);
		System.out.println(aPerson.getHeight());
		aPerson.growHeight(20);
		System.out.println(aPerson.getHeight());
		Human b = aPerson;
		b.growHeight(5);
		System.out.println(b.getHeight());
		System.out.println(aPerson.getHeight());
		
	}
}

class Human {
	private int height = 170;
	
	public Human(int height) {
		// TODO Auto-generated constructor stub
		this.height = height;
	}
	
	public void growHeight(int a) {
		height += a;
	}
	
	public int getHeight() {
		return height;
	} 
}