package tk.learnjavaday01;
import java.util.Scanner;

public class HelloWorld {
	
	// main 方法是这个类的执行入口  
	public static void main(String[] args) {
		//创建一个jdk中用于获取终端输入的信息的工具，并且用一个变量来代表它
		Scanner sc = new Scanner(System.in);
		
		//用工具从终端上获取用户输入的文字
		String name = sc.nextLine();
		
	   //拼接新的字符串
		String result = name + " 好美，" + name + " 真是人见人爱";
		//拼接的结果打印到终端
		System.out.println(result);
		
	}
	
	
	
}
