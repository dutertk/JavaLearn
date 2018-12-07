package tk.learnjavaday09;
/**
 * @author tangkai
 * 按行读取工具
 */


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class BufferedReaderDemo {
	public static void main(String[] args) throws Exception{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/users/tangkai/desktop/Webpages/filetest/abc.txt")));
		String line;
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
			
		}
		bufferedReader.close();
		
	}

}
