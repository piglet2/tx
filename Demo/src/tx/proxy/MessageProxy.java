package tx.proxy;

public class MessageProxy implements MessageHandler{
	
	private MessageHandler handler;
	

	@Override
	public void sendMessage(String msg) {
		System.out.println("处理前");
		handler=new EmailMessage();
		handler.sendMessage(msg);
		System.out.println("处理后");
	}

}
