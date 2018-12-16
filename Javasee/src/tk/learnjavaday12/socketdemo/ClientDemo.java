package tk.learnjavaday12.socketdemo;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws Exception{
		String address = "127.0.0.1";
		//向服务器端发出建立连接的请求
		Socket socket = new Socket(address,4700);
		System.out.println("aa");
		//从连接中拿到发数据的工具
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("Who are you?".getBytes());
		
		//接收数据
		InputStream inputStream = socket.getInputStream();
		byte[] bs = new byte[1024];
		int num = inputStream.read(bs);
		String string = new String(bs, 0, num);
		System.out.println(string);
		
		inputStream.close();
		outputStream.close();
		socket.close();
		
	}

}
