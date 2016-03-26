package socekt;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *@ClassName:Server
 *@author: chenyoulong  
 *@date :2012-7-30 上午10:35:09
 *@Description:TODO 
 */
public class SendServer {

    /**
     * @throws IOException  
     * @Title: main 
     * @Description: TODO 
     * @param @param args   
     * @return void   
     * @throws 
     */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
       ServerSocket server=new ServerSocket(8888);
       System.out.println("server start");
       Socket sock=server.accept();
       sock.setSoTimeout(6000);   //服务器端设置连接超时时间，该操作只对读取（read）操作有效。

       //读取
       //字节流的形式读取   
       // 优缺点分析，弱点：受byte[]大小的限制  ，优点：不受回车符（\r）和换行符（\n）限制
       InputStream input=sock.getInputStream();
       byte[] buf =new byte[1024];
       System.out.println("InputStream==="+input);
       if(input!=null){
           int len=input.read(buf);
         //  ToolKit.writeLog(SendServer.class.getName(), "服务器端收到的报文：\n"+new String(buf, 0, len));
       }

      /* //字符流的形式读取
          //(遇到换行符或者回车符就终止，还是谨慎使用)
       BufferedReader read=new BufferedReader(new InputStreamReader(sock.getInputStream()));
       String readStr=null;
       if((readStr=read.readLine())!=null){
           ToolKit.writeLog(Server.class.getName(), "服务器端收到的报文：\n"+readStr);
       }
       if(read!=null) read.close();
       */

       /*//输出
       String outStr="我是server服务器端";
       BufferedWriter write=new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));

       if(outStr!=null){
           write.write(outStr);
       }
       if(write!=null) write.close();*/

       //挂关闭资源
       if(sock!=null) sock.close();
       if(server!=null) server.close();
    }
}