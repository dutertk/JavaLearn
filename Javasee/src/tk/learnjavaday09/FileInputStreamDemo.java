package tk.learnjavaday09;

import java.io.*;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("/users/tangkai/desktop/webpages/filetest/abc.txt");
		int read = 0;
		/*while((read = fileInputStream.read()) != -1) {
			char c = (char)read;
			System.out.println(c);
		}*/
		
		/**
		 * 一次读取多个字节，然后转成某种数据
		 * read(buf)方法，一次读取buf长度个字节数据，并且读到的数据直接填入数组中
		 * 
		 */
		int num = 0;
		byte[] buf = new byte[(int)file.length()];
		num = new FileInputStream(file).read(buf);
		String strings = new String(buf, 0, buf.length);
		System.out.println(strings);
		
		
		
		
	}

}
