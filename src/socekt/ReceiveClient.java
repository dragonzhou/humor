//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.IOException;
//import java.net.Socket;
//import java.net.UnknownHostException;
//import org.apache.log4j.Logger;
//
///**
// * @ClassName:ReceiveClient
// * @author: chenyoulong
// * @date :2012-8-3 下午2:17:26
// * @Description:TODO
// */
//public class ReceiveClient {
//	private final String	IP		= Setting.RECEIVE_IP;
//	private final int		PORT	= Setting.RECEIVE_PORT;
//	private Logger			log		= Logger.getLogger(Sender.class.getName());
//
//	// 发送
//	/**
//	 * @throws Exception
//	 *             发送报文
//	 * @Title: send
//	 * @Description: TODO
//	 * @param @param reqMessage
//	 * @return void
//	 * @throws
//	 */
//	public void send(String reqMessage) throws Exception {
//		Socket sock = null;
//		BufferedOutputStream out = null;
//		try {
//			sock = new Socket();
//
//			SocketAddress sockAdd = new InetSocketAddress(IP, PORT);
//			sock.connect(sockAdd, 2000); // 客户端设置连接建立超时时间
//
//			out = new BufferedOutputStream(sock.getOutputStream());
//			out.write(reqMessage.getBytes());
//			out.flush();
//
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			log.error("网络连接异常" + Strings.getStackTrace(e));
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			log.error("网络连接异常\n" + Strings.getStackTrace(e));
//			e.printStackTrace();
//		} finally {
//			if (out != null) {
//				try {
//					out.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			if (sock != null) {
//				try {
//					sock.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//
//	// 接收
//	public String reiceve() throws Exception {
//		Socket sock = null;
//		BufferedInputStream in = null;
//
//		try {
//			sock = new Socket(IP, PORT);
//			in = new BufferedInputStream(sock.getInputStream());
//			if ((sock == null) || (in == null)) {
//				throw new Exception("套接口无效，无法读取数据");
//			}
//
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		byte[] bts = new byte[10000];
//		int totalLen = 0, len = 0;
//		while ((len = in.read(bts, totalLen, 1000)) != -1) {
//			totalLen += len;
//		}
//		String result = new String(bts); // 注意字符编码
//		return result.trim();
//	}
//
//	// main函数示例
//
//	public static void main(String[] args){
//        //发送报文
//
//        //发送
//                               String str="我是客户端！"      
//        try {
//                new ReceiveClient().send(str);
//            } catch (Exception e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//
//        //接收报文
//        /*try {
//            String recStr=new Receiver().reiceve();
//            System.out.println("客户端接收到的结果=="+recStr);
//                    } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }*/
//    }
//}