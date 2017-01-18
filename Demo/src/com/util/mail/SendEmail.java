package com.util.mail;

public class SendEmail {

	public static void main(String[] args) {
		  //这个类主要是设置邮件
		   String type = "envisioncn";  //可以是126，gmail等等邮箱类型
		   MailSenderInfo mailInfo = new MailSenderInfo();
		   mailInfo.setMailServerHost("smtp."+type+".com");
		   mailInfo.setMailServerPort("25");
		   mailInfo.setValidate(true);
		   mailInfo.setUserName("song.cai@envisioncn.com"); //发送者的邮箱
		   mailInfo.setPassword("123qweASD");//邮箱密码
		   mailInfo.setFromAddress("song.cai@envisioncn.com"); //发送者的邮箱
		   mailInfo.setToAddress("longlong.zhou@envisioncn.com");  //收件者的邮箱
		   mailInfo.setSubject("测试标题");
		   mailInfo.setContent("测试内容");
		   System.out.println("设置测试邮件");
	         //这个类主要来发送邮件
		   SimpleMailSender sms = new SimpleMailSender();
		   sms.sendTextMail(mailInfo);//发送文体格式 
		    sms.sendHtmlMail(mailInfo);//发送html格式

	}

}
