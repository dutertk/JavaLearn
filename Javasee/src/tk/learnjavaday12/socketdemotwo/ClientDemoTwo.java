package tk.learnjavaday12.socketdemotwo;

import java.net.*;
import java.io.*;

public class ClientDemoTwo {
	public static void main(String[] args) throws Exception {
		String address = "127.0.0.1";
		//向服务器端发出建立连接的请求
		Socket socket = new Socket(address,4700);
		InputStream inputStream = socket.getInputStream();
		OutputStream outputStream = socket.getOutputStream();
		byte[] bs = new byte[1024];
 		outputStream.write("Who Are You?".getBytes());
		System.out.println("收到第一个问题的答案： " + new String(bs, 0, inputStream.read(bs)));
		
		outputStream.write("How Old Are You?".getBytes());
		System.out.println("收到的第二个问题的答案： " + new String(bs, 0, inputStream.read(bs)));
		
		inputStream.close();
		outputStream.close();
		socket.close();
		
		
	}
	
	
}
