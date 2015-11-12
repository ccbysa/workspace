package hk.com.google.duotai;
/**
 * ≤‚ ‘∂‡Ã¨
 * test animal's voice
 * @author willard
 * @version 1.0
 */
public class Test01 {
	/*public static void testAnimalVoice(Dog c) {
		c.Voice();
	}
	
	public static void testAnimalVoice(Pig c) {
		c.Voice();
	}*/
	public static void testAnimalVoice(Animal c) {
		c.Voice();
		if (c instanceof Cat) {
			((Cat)c).catMouse();
		}
	}
	public static void main(String[] args) {
		Cat aCat = new Cat();
		Dog aDog = new Dog();
		Pig aPig = new Pig();
		testAnimalVoice(aCat);
		testAnimalVoice(aDog);
		testAnimalVoice(aPig);
		System.out.println("++++++++++++++++++++");
		System.out.println(new Pig());
		testAnimalVoice(new Pig());
		new Cat().catMouse();
		Animal a = new Cat();
		testAnimalVoice(a);
		((Cat)a).catMouse();
	}
}
