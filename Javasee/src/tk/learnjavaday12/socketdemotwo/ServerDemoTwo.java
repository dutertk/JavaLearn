package tk.learnjavaday12.socketdemotwo;

import java.net.*;
import java.io.*;

public class ServerDemoTwo {
	public static void main(String[] args) throws Exception {
		
		//建立连接，注册端口
		ServerSocket serverSocket = new ServerSocket(4700);
		
		Socket socket = serverSocket.accept();
		
		InputStream inputStream = socket.getInputStream();
		OutputStream outputStream = socket.getOutputStream();
		byte[] bs = new byte[1024];
		//第一次接收
		System.out.println("接收到的第一个问题是： " + new String(bs, 0, inputStream.read(bs)));
		//第一次回答
		outputStream.write("This is Milan.".getBytes());
		
		//第二次接收
		System.out.println("接收到的第二个问题是： " + new String(bs,0,inputStream.read(bs)));
		//第二次回答
		outputStream.write("Already 119 Years".getBytes());
		
		inputStream.close();
		outputStream.close();
		socket.close();
		
	}

}
