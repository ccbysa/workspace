package hk.com.google.CallBack;

public class PaintFrame {
	public static void drawFrame(IMyFrame f){
		System.out.println("PaintFrame.drawFrame()");
		System.out.println("启动线程");
		System.out.println("增加循环");
		System.out.println("查找消息栈");
		f.paint();
		System.out.println("启动缓存");
		System.out.println("增加效率");
	}
	public static void main(String[] args) {
		drawFrame(new GameFrame());
		System.out.println("***************");
		drawFrame(new Cirtle());
	}
}

//class GameFrame implements IMyFrame{
class GameFrame extends IMyFrame{
	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("GameFrame.paint()");
		System.out.println("Game over");
	}
	
}
//class Cirtle implements IMyFrame{
class Cirtle extends IMyFrame{

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("Cirtle.paint()");
		System.out.println("Cir");
	}
	
}