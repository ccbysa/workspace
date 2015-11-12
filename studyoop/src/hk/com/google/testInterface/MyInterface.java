package hk.com.google.testInterface;

public interface MyInterface {
	/*public static final*/String mAX_GREAD = "BOSS";
	public static final int MAX_SPEED = 120;
	
	public void test01();
	/*public abstract*/ int test02(int a, int b);//ƒ¨»œ Ù–‘£∫public abstract
}

interface Attack{
	void attack();
}

interface MultiFace extends MyInterface, Attack{
	void CC();
}