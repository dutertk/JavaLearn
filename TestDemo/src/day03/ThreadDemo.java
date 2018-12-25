package day03;
/**
 * 多线程实现方法一
 * 继承Thread类来实现
 * 
 * @author TK
 *
 */
public class ThreadDemo 
{
	public static void main(String[] args) {
		new ThreadTest().start();
		while(true)
		{
			System.out.println("MainThread is running");
		}
		
	}

}
class ThreadTest extends Thread
{
	public void run() 
	{
		while (true) 
		{
		System.out.println(Thread.currentThread().getName() +" is running!");
		}
	}
}
