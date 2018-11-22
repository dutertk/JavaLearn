package tk.learnjavaday02.circle;
import java.util.Scanner;


public class NumberGuess {

	public static void main(String[] args) {
		
		Boolean guess = true;
		for (int i = 0; i < 100; i++) {
			
		
		System.out.println("请输入一个数字");
		Scanner scanner = new Scanner(System.in);
	    String xx = scanner.nextLine();
	    int userguess =  Integer.parseInt(xx);
	    if (userguess > 9) {
	    	System.out.println("猜的太大了");
		}else if (userguess < 9) {
			System.out.println("猜的太小了");
		}else {
			System.out.println("刚刚好");
			
			//guess = false;
			break;
		}}
		//想办法改循环条件或者终止循环
	    System.out.println("已猜对，游戏结束！");
		
	}
}
