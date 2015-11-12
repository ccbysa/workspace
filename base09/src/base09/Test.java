package base09;

public class Test {
	public static void main(String[] args) {
		System.out.println(Human.getPopulation());
		Human aPerson = new Human(160);
		System.out.println(Human.getPopulation());
	}
}