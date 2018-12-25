package day03;

/**
 * ʵ�ֶ��̵߳ĵڶ��ַ�ʽ�� ͨ��ʵ��runnable�ӿ�
 * 
 * @author TK
 *
 */
public class ThreadDemoByRunnable {
	public static void main(String[] args) {
		TestThread testThread = new TestThread();
		new Thread(testThread).start();
		while(true) {
			System.out.println("Main is running!");
		}
	}
}

class TestThread implements Runnable {
	
	public void run() {
		
		while(true) {
			System.out.println(Thread.currentThread().getName() + " is running by implementing runnable!");
		}
	}
}
