import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jcifs.smb.SmbException;
import jcifs.smb.SmbFile;
import jcifs.smb.SmbFileInputStream;
import jcifs.smb.SmbFileOutputStream;


public class Test {

	public static void main(String[] args) throws  MalformedURLException, SmbException {
		//smb://xxx:xxx@192.168.2.188/testIndex/  
        //xxx:xxx是共享机器的用户名密码
        String remoteUrl="smb://Chellenger:R4XVPk7Jh4BWSQ@172.16.3.48/mtq/";
        String localDir="D:\\yyy\\MTQ";
        smbGet(remoteUrl,localDir);
        
        
//        SmbFile file = new SmbFile(remoteUrl);
//        if(file.exists()){
//            SmbFile[] files = file.listFiles();
//            for(SmbFile f : files){
//                System.out.println(f.getName());
//            }
//        }
        
	}
	
	 /** 
     * 从共享目录下载文件 存到本地 
     * @param remoteUrl 
     *            远程路径 
     * @param localDir 
     *            要写入的本地路径 
     */  
	public static void smbGet(String remoteUrl, String localDir) {  
        InputStream in = null;  
        OutputStream out = null;  
        try {  
            SmbFile smbFile = new SmbFile(remoteUrl);
            if(smbFile.exists()){
            	SmbFile[] files = smbFile.listFiles();
            	 for (SmbFile  remoteSmbFile : files) {
            		 String remoteSmbFileName = remoteSmbFile.getName();
            		 File localFile = new File(localDir+File.separator+remoteSmbFileName);
            		 File local = new File(localDir);
    			     if (!localFile.exists()) {
    			    	 local.mkdir();
    			    	 localFile.createNewFile();
    			     }	
            		 in= new BufferedInputStream(new SmbFileInputStream(remoteSmbFile));
            		 out = new BufferedOutputStream(new FileOutputStream(localFile));
            		 byte[] buffer = new byte[1024];
                     while (in.read(buffer) != -1){
                         out.write(buffer);
                         buffer = new byte[1024];
                     }     
                     out.close();  
                     in.close();  
         		}
            }else{
            	System.out.println("MTQ共享文件不存在："+remoteUrl);
                return;
            }
        } catch (Exception e) {  
        	e.printStackTrace();  
        } 
    }  

}
