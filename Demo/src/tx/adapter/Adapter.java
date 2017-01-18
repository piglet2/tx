package tx.adapter;

/**
 * 类的适配器模式
 * 
 * */
public class Adapter extends Source implements Targetable{

	@Override
	public void method2() {
		System.out.println("方法2");
		
	}
	
}
