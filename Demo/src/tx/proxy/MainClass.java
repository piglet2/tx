package tx.proxy;

/**
 *调用类 
 * 
 * */
public class MainClass {

	public static void runProxy(MessageHandler handler){
		handler.sendMessage("测试信息");
	}
	
	public static void main(String[] args){
		runProxy(new EmailMessage());
		System.out.println("!!!!!!!!!!!!!!!!Proxy");
		runProxy(new MessageProxy());
	}
}
