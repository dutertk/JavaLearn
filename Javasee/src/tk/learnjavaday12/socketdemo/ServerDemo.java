package tk.learnjavaday12.socketdemo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws Exception{
		//启动一个socket服务端（本质是向操作系统注册一个端口号）
		 ServerSocket serverSocket = new ServerSocket(4700);
		 
		 //监听端口号
		 Socket socket = serverSocket.accept();
		 //通过输入流获取监听数据
		 InputStream inputStream = socket.getInputStream();
//		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(acceptData.getInputStream()));
		 byte[] bs = new byte[1024];
		 
		 int read = inputStream.read(bs);
		 
		 System.out.println("收到客户端的消息" + new String(bs,0,read));
		 //向客户端发送数据
		 OutputStream outputStream = socket.getOutputStream();
		 
		 outputStream.write("This is Milan.".getBytes());
		 
		 //务必牢记每次都要关闭
		 inputStream.close();
		 outputStream.close();
		 serverSocket.close();
		 
		
		
		
	}

}
