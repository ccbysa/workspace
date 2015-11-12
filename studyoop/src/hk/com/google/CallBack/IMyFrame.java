package hk.com.google.CallBack;
/*通过接口interface实现
public interface IMyFrame{
	void paint();
}
*/
/*通过多态 重写实现
public class IMyFrame{
	void paint(){
		System.out.println("IMyFrame.paint()");
	}
}
*/
/*通过抽象方法、抽象类实现*/
public abstract class IMyFrame{
	abstract void paint();
}