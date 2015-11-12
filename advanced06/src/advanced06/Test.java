package advanced06;

public class Test {
	public static void main(String[] args) {
		Human[] persons = new Human[2];
		
		persons[0] = new Human(160);
		persons[1] = new Human(170);
		System.out.println("1: " + persons[0].getHeight());
		System.out.println("2: " + persons[1].getHeight());
		
		int[] scores = {1, 2, 3, 4, 5};
		System.out.println(scores[3]);
		for (int i = 0; i < scores.length; i++) {
			System.out.println(i+":   " + scores[i]);
		}
		int[] aTo = new int[3];
		System.arraycopy(scores, 2, aTo, 0, 3);
		for (int i = 0; i < aTo.length; i++) {
			System.out.println(i+": ato  " + aTo[i]);
		}
		
		String[] names = {"Lilei", "Xiaoming", "Wuxiao"};
		System.out.println(names[2]);
		
	}
}

class Human {
	private int height;
	
	public Human(int h) {
		// TODO Auto-generated constructor stub
		height = h;
	}
	
	public int getHeight() {
		return height;
	} 
}