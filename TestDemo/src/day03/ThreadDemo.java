package day03;
/**
 * ���߳�ʵ�ַ���һ
 * �̳�Thread����ʵ��
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
