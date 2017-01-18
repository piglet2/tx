package tx.proxy;

/**
 * 通过Email方式发送消息的实现类    
 * 
 * */
public class EmailMessage implements MessageHandler{

	@Override
	public void sendMessage(String msg) {
		System.out.println("发送邮件："+msg);
		
	}

}
